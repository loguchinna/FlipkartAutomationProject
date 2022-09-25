package org.utility;

public class PageObjectManager {

	private PageObjectManager() {

	}

	private static PageObjectManager manager;
	private static SearchPage search;
	private static SelectionPage select;
	private static OrderPage order;
	private static ValidationPage validate;
	private static RemoveFromCartPage remove;

	public static PageObjectManager getManager() {

		return manager == null ? manager = new PageObjectManager() : manager;

	}

	public static SearchPage getSearch() {
		return search == null ? search = new SearchPage() : search;

	}

	public static SelectionPage getSelect() {
		return select == null ? select = new SelectionPage() : select;
	}

	public static OrderPage getOrder() {
		return order == null ? order = new OrderPage() : order;
	}

	public static ValidationPage getValidate() {
		return validate == null ? validate = new ValidationPage() : validate;
	}

	public static RemoveFromCartPage getRemove() {
		return remove == null ? remove = new RemoveFromCartPage() : remove;
	}

}
