let peserta =[
    {
        nama:"Izaz",
        background: "IT",
        jenis_kelamin: "Laki-Laki",
        foto: "https://media-exp1.licdn.com/dms/image/C5603AQGQeF7EJ7CLVw/profile-displayphoto-shrink_800_800/0/1658505868234?e=1669248000&v=beta&t=k60daOqINUbxW_i7-uiB3iSDwomYMCD7RqoCKpdWEDM",
        hobby: [
            "hiking",
            "freediving"
        ]
    },
    {
        nama:"Veve",
        background: "IT",
        jenis_kelamin: "Laki-Laki",
        foto: "https://media-exp1.licdn.com/dms/image/C5603AQG5JyL08xr9mQ/profile-displayphoto-shrink_800_800/0/1641400290742?e=1669248000&v=beta&t=9pX-gRT9qzQSZCtD56wGohwHJSdtcGyc_CdC_NjVoLM",
        hobby: [
            "hiking",
            "freediving"
        ]
    },
    {
        nama:"Raden",
        background: "IT",
        jenis_kelamin: "Laki-Laki",
        foto: "https://media-exp1.licdn.com/dms/image/C5603AQE0AroChNf10g/profile-displayphoto-shrink_800_800/0/1651021463335?e=1669248000&v=beta&t=jm8olHMK46Mc_HBX7gzgOCt9cCY6r3fr52LR3dFAYig",
        hobby: [
            "hiking",
            "freediving"
        ]
    },
    {
        nama:"Popy",
        background: "IT",
        jenis_kelamin: "Perempuan",
        foto: "https://media-exp1.licdn.com/dms/image/C5603AQGUrvYskKE0vw/profile-displayphoto-shrink_800_800/0/1652719524053?e=1669248000&v=beta&t=dWzqhvAt3aglBor-YB_AWMM8oPMfeqVDnCfoy_KzmHY",
        hobby: [
            "hiking",
            "freediving"
        ]
    },
    {
        nama:"Nanda",
        background: "IT",
        jenis_kelamin: "Perempuan",
        foto: "https://media-exp1.licdn.com/dms/image/C4E03AQEIPuVK5tnPMQ/profile-displayphoto-shrink_800_800/0/1658834020900?e=1669248000&v=beta&t=qR1nOsPHYn1IOYn1Nu3vktQvVV3b6s4cLLbedejDCLo",
        hobby: [
            "hiking",
            "freediving"
        ]
    },
    {
        nama:"Dimas",
        background: "IT",
        jenis_kelamin: "Perempuan",
        foto: "https://media-exp1.licdn.com/dms/image/D5635AQHJ-u98wG1jEQ/profile-framedphoto-shrink_800_800/0/1636103455270?e=1664427600&v=beta&t=XF0_OTaMWphEBREYxba2v-s0xVCAh3GiLidxdchxsCU",
        hobby: [
            "hiking",
            "freediving"
        ]
    },
] ;

peserta.forEach(peserta => {
    $("#test").append(`
    <div class="col-sm-4 mt-5" style="border: 2px solid green">
        <div class="card" style="width: 18rem;">
            <img src="${peserta.foto}" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Nama ${peserta.nama}</h5>
                <h5 class="card-title">Jenis Kelamin ${peserta.jenis_kelamin}</h5>
                <h5 class="card-title">Background ${peserta.background}</h5>
                <h5 class="card-title">Hobi: ${peserta.hobby}</h5>
            </div>
        </div>
    </div>
    `);
});

// console.log();