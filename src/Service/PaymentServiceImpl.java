package Service;

import Dao.PaymentDao;

public class PaymentServiceImpl implements PaymentService {
	
	public PaymentDao paydao = new PaymentDao();
	
	@Override
	public void card() {

	}
	public void payment(){
		paydao.payment();
	}
}
