package Cafe;

abstract interface IVendingMachineBiz {
	abstract void cartDrink(Drink drink);
	abstract void printCart();
	abstract void printDrinkList(Drink[] drinkList);
}
