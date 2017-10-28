import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtuto.model.CarManufacturer;
import com.springtuto.service.CarManufacturerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CarManufacturerService service = new CarManufacturerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CarManufacturerService service = appContext.getBean("carManufacturerService",CarManufacturerService.class);
		List<CarManufacturer> carManufacturers=service.findAllManufacturers();
		
		for(CarManufacturer carManufacturer : carManufacturers) {
			System.out.println(carManufacturer.getBrandName()+" company headquarters is in "
			+carManufacturer.getHeadquarters());
		}
		
	}

}
