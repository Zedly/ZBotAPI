/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event;

/**
 *
 * @author Dennis
 */
public class TransactionResponseEvent extends Event {

    private final int windowID;  // The ID of the window that the action occurred in
    private final int actionNumber;  // Every action that is to be accepted has a unique number. This number is an incrementing integer (starting at 0) with separate counts for each window ID.
    private final int status;  // Whether the action was accepted

    public TransactionResponseEvent(int windowId, int transactionId, int status) {
        this.windowID = windowId;
        this.actionNumber = transactionId;
        this.status = status;
    }

    public int getWindowID() {
        return windowID;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public int getStatus() {
        return status;
    }
}
