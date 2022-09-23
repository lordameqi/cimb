$('#tombol').on("click",function(){
    let get = $('#atas').text();
    console.log(get);
    $('#bawah').text(get);
});


$('#car').on("change",function(){
    let get2 = $("#car :selected").text();
    $("#carHasil").text(get2);
})

$("#tombol2").on("click", function(){
    $("#bootcemp").css({"color": "red","font-weight": "bold"});
});

$("#tulisan").on("input", function() {
    $("#hasilnya").text($(this).val()); 
 });

$("#box1").on("mouseover",function(){
    $(this).css("background-color","green");
});
$("#box1").on("mouseleave",function(){
    $(this).css("background-color","red");
});
