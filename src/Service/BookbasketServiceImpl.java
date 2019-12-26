package Service;

import Dao.BookBasketDao;

public class BookbasketServiceImpl implements BookBasketService {

	@Override
	public void BookBasket() {
		BookBasketDao.BookBasket();

	}

	@Override
	public void BookBasketout() {
		BookBasketDao.BookBasketout();

	}

	@Override
	public void BookBasketpay() {
		
		BookBasketDao.BookBasketpay();
	}

	@Override
	public void BookBasketList() {
		BookBasketDao.BookBasketList();
		
	}

}
