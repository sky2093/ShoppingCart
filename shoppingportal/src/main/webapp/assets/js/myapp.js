//Using jQuery for getting mainapp.js when document is ready

$(function(){
	//solving the active menu problem and using selector IDi.e. #about in case to fetch jQuery element
	
	switch (menu) {
	
	case 'Home':
		$('#home').addClass('active');
		break;

	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
	case 'All Products':
		$('#listProducts').addClass('active');             
		break;
			
	default:
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
		
	
	}
	
	
	
});