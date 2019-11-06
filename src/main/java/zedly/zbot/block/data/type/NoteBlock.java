package zedly.zbot.block.data.type;

import zedly.zbot.Instrument;
import zedly.zbot.Note;
import zedly.zbot.block.data.Powerable;

/**
 * 'instrument' is the type of sound made when this note block is activated.
 * <br>
 * 'note' is the specified tuned pitch that the instrument will be played in.
 */
public interface NoteBlock extends Powerable {

    /**
     * Gets the value of the 'instrument' property.
     *
     * @return the 'instrument' value
     */
    Instrument getInstrument();

    /**
     * Gets the value of the 'note' property.
     *
     * @return the 'note' value
     */
    Note getNote();

}
