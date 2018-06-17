//Using jQuery for getting mainapp.js when document is ready

$(function(){
	//solving the active menu problem and using selector id i.e. #about in case to fetch jQuery element
	
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
	default:
		$('#home').addClass('active');
		break;
		
	
	}
	
	
	
});