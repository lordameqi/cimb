const Section = (data, bg) => {
    return `
    <section class="container-fluid bg-${bg} d-flex align-items-center justify-content-center" style="height:100vh">
        <h1 class="text-light">
            ${data}
        </h1>
    </section>
    `
}

export default Section