package zedly.zbot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dennis
 */
public enum VillagerProfession {

    FARMER, LIBRARIAN, PRIEST, BLACKSMITH, BUTCHER;

    public static VillagerProfession getById(int id) {
        switch (id) {
            case 1:
                return LIBRARIAN;
            case 2:
                return PRIEST;
            case 3:
                return BLACKSMITH;
            case 4:
                return BUTCHER;
            default:
                return FARMER;
        }
    }
}
