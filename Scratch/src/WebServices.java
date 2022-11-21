import java.util.List;

public class WebServices {

	public static void main(String[] args) {
		
		https://api.amazon.com/products/lister
		
		// Listing the products
			// xml - protocol
			// xml-f1 
			// xml-f2
		
		ProductsLister productsLister;
		
		List<Product> products 
			= productsLister.list("category={mobile, devices}");
		
		// input
		<productInput>
			<category>
				<name>mobile</name>
				<name>devices</name>
			</category>
		</productInput>
		
		// Initiate Payment
		https://api.amazon.com/payments/initiate

		// DeliveryManagement
	}
}
