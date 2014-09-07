package com.cu.dp.creational.builder;
import com.cu.utils.Logger;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		Logger.log("Veg Meal");
		vegMeal.showItems();
		Logger.log("Total cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		Logger.log("VNoneg Meal");
		nonVegMeal.showItems();
		Logger.log("Total cost: " + nonVegMeal.getCost());
		
	}

}
