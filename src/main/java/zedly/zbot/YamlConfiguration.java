/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author Dennis
 */
public class YamlConfiguration {

    private final Map<String, Object> map;

    public static YamlConfiguration emptyConfiguration() {
        return new YamlConfiguration(new LinkedHashMap<>());
    }
    
    public static YamlConfiguration read(File file) {
        try {
            FileReader fr = new FileReader(file);
            return read(fr);
        } catch (IOException ex) {
            return emptyConfiguration();
        }
    }

    public static YamlConfiguration read(InputStream is) {
        InputStreamReader isrdr = new InputStreamReader(is);
        return read(isrdr);
    }

    public static YamlConfiguration read(Reader rdr) {
        try {
            Yaml yaml = new Yaml();
            Object o = yaml.load(rdr);
            if (!(o instanceof Map)) {
                return emptyConfiguration();
            }
            Map<String, Object> map = (Map<String, Object>) o;
            return new YamlConfiguration(map);
        } catch (Exception ex) {
            return emptyConfiguration();
        }
    }

    private YamlConfiguration(Map<String, Object> content) {
        map = content;
    }

    public boolean getBoolean(String path, boolean defaultValue) {
        Object value = get(path);
        if (value instanceof Boolean) {
            return (boolean) value;
        } else {
            return defaultValue;
        }
    }
    
    public double getDouble(String path, double defaultValue) {
        Object value = get(path);
        if (value instanceof Double) {
            return (double) value;
        } else {
            return defaultValue;
        }
    }
    
    public int getInt(String path, int defaultValue) {
        Object value = get(path);
        if (value instanceof Integer) {
            return (int) value;
        } else {
            return defaultValue;
        }
    }

    public <T> List<T> getList(String path, Class<T> tClass) {
        Object value = get(path);
        if (value instanceof List) {
            try {
                List<T> list = (List<T>) value;
                return list;
            } catch (ClassCastException ex) {
                return null;
            }
        } else {
            return null;
        }
    }

    public YamlConfiguration getSection(String path) {
        Object value = get(path);
        if (value instanceof Map) {
            Map<String, Object> innerMap = (Map<String, Object>) value;
            return new YamlConfiguration(innerMap);
        } else {
            return null;
        }
    }

    public String getString(String path, String defaultValue) {
        Object value = get(path);
        if (value instanceof String) {
            return (String) value;
        } else {
            return defaultValue;
        }
    }

    public Object get(String path) {
        String[] sections = path.split("\\.");
        Map<String, Object> innerMap = map;
        for (int i = 0; i < sections.length - 1; i++) {
            Object o = innerMap.get(sections[i]);
            if (o == null) {
                return null;
            } else if (o instanceof Map) {
                innerMap = (Map<String, Object>) o;
            } else {
                return null;
            }
        }
        return innerMap.get(sections[sections.length - 1]);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public Set<String> keySet() {
        return map.keySet();
    }

    public void save(File file) throws IOException {
        new Yaml().dump(map, new FileWriter(file, false));
    }

    public boolean set(String path, Object value) {
        String[] sections = path.split("\\.");
        Map<String, Object> innerMap = map;
        for (int i = 0; i < sections.length - 1; i++) {
            Object o = innerMap.get(sections[i]);
            if (o == null) {
                Map<String, Object> newMap = new LinkedHashMap<>();
                innerMap.put(sections[i], newMap);
                innerMap = newMap;
            } else if (o instanceof Map) {
                innerMap = (Map<String, Object>) o;
            } else {
                System.out.println(o);
                return false;
            }
        }
        innerMap.put(sections[sections.length - 1], value);
        return true;
    }

    public int size() {
        return map.size();
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
