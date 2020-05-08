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
public class RecipeResponseEvent extends Event {
    
    private final int windowId;
    private final String recipeId;
    
    public RecipeResponseEvent(int windowId, String recipeId) {
        this.windowId = windowId;
        this.recipeId = recipeId;
    }

    /**
     * @return the windowId
     */
    public int getWindowId() {
        return windowId;
    }

    /**
     * @return the recipeId
     */
    public String getRecipeId() {
        return recipeId;
    }
    
}
