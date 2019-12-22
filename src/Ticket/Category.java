package Ticket;


public class Category {
    protected String Category; 
protected int categoryID;

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        if(categoryID > 0){
        this.categoryID = categoryID;}
        
    }
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        if(Category.length() != 0 ){
        this.Category = Category;}
       
    }
    
}