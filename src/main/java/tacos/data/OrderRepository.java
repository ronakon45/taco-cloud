package tacos.data;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
	List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);

	List<TacoOrder> findByDeliveryNameAndDeliveryCityAllIgnoresCase(String deliveryName, String deliveryCity);

	List<TacoOrder> findByDeliveryCityOrderByDeliveryName(String city);

	@Query("Order o where o.deliveryCity='Seattle'")
	List<TacoOrder> readOrdersDeliveredInSeattle();
}