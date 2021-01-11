$(document).ready(function(){

$.ajax({
url:"http://localhost:8080/conference/user"

}).then(function(data){

$('.firstname').append(data.firstname);
$('.lastName').append(data.lastName);
$('.age').append(data.age);
});

});