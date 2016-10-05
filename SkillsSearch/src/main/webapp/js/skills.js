// When the document is ready
$(document).ready(function() {

	alert("Hello");
	// validation rules
	// by default it will append a <label class="error> element to the invalid
	// input
	// and will add a "error" class to the input
	$("#example1").validate({
		rules : {
			"example1-email" : {
				required : true,
				email : true
			},
			"example1-password" : {
				required : true,
				minlength : 5
			}
		}
	});
});