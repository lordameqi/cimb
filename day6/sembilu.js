let arraykan = [];

function add() {
    

    let id = $('#masukanid').val();
    let masukan = $('#masukan').val();
    console.log(id);
    console.log(masukan);
    

    var edit = "<button onclick='ubah()' class='edit' href='JavaScript:void(0);' >Edit</button>";
    var del = "<button onclick='deletekan()' class='delete' href='JavaScript:void(0);'>Delete</button>";

    var table = "<tr><td>" + id + "</td><td>" + masukan + "</td><td>" + edit + "</td><td>" + del + "</td></tr>";
    $("#datatabel").append(table);
    arraykan.push({id,masukan});
    console.log(arraykan);
}

function deletekan(){
    $("#datatabel").on("click", ".delete", function (e) {
        if (confirm("Are you sure want to delete this record!")) {
            $(this).closest('tr').remove();
            let index=arraykan.indexOf(this);
            arraykan.splice(index,1);
            console.log(arraykan);
        } else {
            e.preventDefault();
        }
    });
}

function ubah() {
    $('#btnUpdate').on('click', function () {
        var name, country, id;
        id = $("#masukanid").val();
        name = $("#masukan").val();
      

        $('#datatabel tbody tr').eq($('#hfRowIndex').val()).find('td').eq(0).html(id);
        $('#datatabel tbody tr').eq($('#hfRowIndex').val()).find('td').eq(1).html(name)

        $('#btnAdd').show();
        $('#btnUpdate').hide();
       
    });

    $("#datatabel").on("click", ".edit", function (e) {
        var row = $(this).closest('tr');
        $('#hfRowIndex').val($(row).index());
        var td = $(row).find("td");
        $('#masukanid').val($(td).eq(0).html());
        $('#masukan').val($(td).eq(1).html());
        
        $('#btnAdd').hide();
        $('#btnUpdate').show();
    });
}


