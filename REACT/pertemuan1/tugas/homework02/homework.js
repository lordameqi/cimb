const videoData = [
  {
    name: 'Miss Scarlet',
    present: true,
    rooms: {
      kitchen: false,
      ballroom: false,
      conservatory: false,
      'dining room': false,
      'billiard room': false,
      library: false
    }
  },
  {
    name: 'Rusty',
    present: false,
    rooms: {
      kitchen: false,
      ballroom: false,
      conservatory: false,
      'dining room': false,
      'billiard room': false,
      library: false
    }
  },
  {
    name: 'Colonel Mustard',
    present: true,
    rooms: {
      kitchen: false,
      ballroom: false,
      conservatory: false,
      'dining room': false,
      'billiard room': false,
      library: false
    }
  },
  {
    name: 'Professor Plum',
    present: true,
    rooms: {
      kitchen: false,
      ballroom: false,
      conservatory: false,
      'dining room': false,
      'billiard room': false,
      library: false
    }
  }
]
console.log("READ DARI ATAS SAMPE BAWAH INI BUKAN EROR CUMA EMANG MAU BERCERITA AJA");
console.log(""+"Kumpulan Data awal "+"\n"+JSON.stringify(videoData));
console.log("Jumlah object sebelum di filter = " + videoData.length+"\n");
console.log("DATA HASIL PASCA DI FILTER PRESENT TRUE");
let hasil = videoData.filter(video => video.present === true);
console.log(hasil);
console.log("Jumlah object terkini pasca di filter = "+hasil.length);