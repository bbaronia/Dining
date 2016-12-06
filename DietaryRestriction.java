package Dining;
import java.sql.*;

public class DietaryRestriction {
	private int itemId;
	private boolean isGlutenFree;
	private boolean isSoyFree;
	private boolean isDairyFree;
	private boolean isVegan;
	private boolean isVegetarian;
	private boolean isPeanutFree;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public boolean isGlutenFree() {
		return isGlutenFree;
	}
	public void setGlutenFree(boolean isGlutenFree) {
		this.isGlutenFree = isGlutenFree;
	}
	public boolean isSoyFree() {
		return isSoyFree;
	}
	public void setSoyFree(boolean isSoyFree) {
		this.isSoyFree = isSoyFree;
	}
	public boolean isDairyFree() {
		return isDairyFree;
	}
	public void setDairyFree(boolean isDairyFree) {
		this.isDairyFree = isDairyFree;
	}
	public boolean isVegan() {
		return isVegan;
	}
	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public boolean isPeanutFree() {
		return isPeanutFree;
	}
	public void setPeanutFree(boolean isPeanutFree) {
		this.isPeanutFree = isPeanutFree;
	}
}
