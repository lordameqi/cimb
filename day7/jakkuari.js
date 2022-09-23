$("#cick").on("click",function(){
    alert("sudah di klik");
});

$("#doubleClick").on("dblclick",function(){
    alert("Ini double click");
});

$("#box1").on("mouseover",function(){
    console.log("Alkohol, kmau jahat tapi enak");
});

$("#box1").on("mouseleave",function(){
    console.log("Alkohol, walau pajakmu tinggi");
});
// let i =0;
// $('#idkeypret').keypress(function(){
//    $("#hitung").text(i+=1);
// });

$("#idchange").on("change",function(){
    // console.log(this.value);
    alert(this.value);
});