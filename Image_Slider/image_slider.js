let images = [
    "imagesFolder/01.jpg",
    "imagesFolder/02.jpg",
    "imagesFolder/03.jpg",
    "imagesFolder/04.jpg",
    "imagesFolder/05.jpg",
    "imagesFolder/06.jpg",
    "imagesFolder/07.jpg",
    "imagesFolder/08.jpg",
    "imagesFolder/09.jpg",
    "imagesFolder/10.jpg",

];

let index = 1;

function showImage() {
    document.getElementById("sliderImage").src = images[index];
}

function nextImage() {
    index = (index + 1) % images.length;
    showImage();
}

function prevImage() {
    index = (index - 1 + images.length) % images.length; 
    showImage();
}
