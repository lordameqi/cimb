var them_dogs = [{
    name: 'Henry',
    age: 0.5,
    breed: 'Aussie',
    food: 'kibble',
    toys: ['tennis ball', 'chew toy'],
    picture: 'https://kulidan.com/wp-content/uploads/2020/04/Plasticology-georgia-university-anak-tangguh2.jpg'
}, {
    name: 'Tilly',
    age: 5,
    breed: 'Mutt',
    food: 'kibble',
    toys: ['bone', 'kong', 'squeaky toy'],
    picture: 'https://th.bing.com/th/id/OIP.EGN6_I1OFu8_R-qO5ACzBAEsDf?pid=ImgDet&rs=1'
}, {
    name: 'Apollo',
    age: 10,
    breed: 'Labrador',
    food: 'absolutely anything',
    toys: ['old sock', 'other old sock', 'more old socks'],
    picture: 'https://www.ruangguru.com/hs-fs/hubfs/Imported_Blog_Media/magang-jobsitedotcodotuk-1.jpg?width=1500&height=800&name=magang-jobsitedotcodotuk-1.jpg'
}];

them_dogs.forEach(them_dogs => {
    $("#output").append(`
    <img src="${them_dogs.picture}">
    <p>${them_dogs.name}</p>
    `);
    
});

