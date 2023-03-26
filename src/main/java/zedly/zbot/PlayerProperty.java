/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zedly.zbot;

/**
 *
 * @author Dennis
 */
public interface PlayerProperty {
        /**
     * @return the name
     */
    String getName();

    /**
     * @return the value
     */
    String getValue();

    /**
     * @return the isSigned
     */
    boolean isIsSigned();

    /**
     * @return the signature
     */
    String getSignature();
}