const API = "http://localhost:8080/movies";

let selectedId = null;

function loadMovies() {

    fetch(API)

        .then(response => response.json())

        .then(data => {

            const tableBody =
                document.getElementById("table-body");

            tableBody.innerHTML = "";

            data.forEach(movie => {

                const row =
                    document.createElement("tr");

                row.innerHTML = `

                    <td>${movie.id}</td>

                    <td>${movie.name}</td>

                    <td>${movie.genre}</td>

                    <td>${movie.director}</td>

                    <td>${movie.releaseYear}</td>

                    <td class="actions"></td>

                `;

                const actionsCell =
                    row.querySelector(".actions");

                const editButton =
                    document.createElement("button");

                editButton.textContent = "Editar";

                editButton.addEventListener("click", () => {
                    selectMovie(movie);
                });

                const deleteButton =
                    document.createElement("button");

                deleteButton.textContent = "Excluir";

                deleteButton.addEventListener("click", () => {
                    deleteMovie(movie.id);
                });

                actionsCell.appendChild(editButton);

                actionsCell.appendChild(deleteButton);

                tableBody.appendChild(row);
            });
        })

        .catch(error => {
            console.error(
                "Erro ao carregar filmes:",
                error
            );
        });
}

function addMovie() {

    const movie = getFormData();

    fetch(API, {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(movie)

    })

    .then(response => {

        if (!response.ok) {
            throw new Error("Erro ao adicionar");
        }

        clearForm();

        loadMovies();
    })

    .catch(error => {

        console.error(
            "Erro ao adicionar filme:",
            error
        );
    });
}

function updateMovie() {

    if (selectedId === null) {

        alert(
            "Selecione um filme para editar."
        );

        return;
    }

    const movie = getFormData();

    fetch(`${API}/${selectedId}`, {

        method: "PUT",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(movie)

    })

    .then(response => {

        if (!response.ok) {
            throw new Error("Erro ao atualizar");
        }

        selectedId = null;

        clearForm();

        loadMovies();
    })

    .catch(error => {

        console.error(
            "Erro ao atualizar filme:",
            error
        );
    });
}

function deleteMovie(id) {

    fetch(`${API}/${id}`, {

        method: "DELETE"

    })

    .then(response => {

        if (!response.ok) {
            throw new Error("Erro ao deletar");
        }

        loadMovies();
    })

    .catch(error => {

        console.error(
            "Erro ao deletar filme:",
            error
        );
    });
}

function selectMovie(movie) {

    selectedId = movie.id;

    document.getElementById("name").value =
        movie.name;

    document.getElementById("genre").value =
        movie.genre;

    document.getElementById("director").value =
        movie.director;

    document.getElementById("year").value =
        movie.releaseYear;

    console.log(
        "Filme selecionado:",
        selectedId
    );
}

function getFormData() {

    return {

        name:
            document.getElementById("name").value,

        genre:
            document.getElementById("genre").value,

        director:
            document.getElementById("director").value,

        releaseYear:
            parseInt(
                document.getElementById("year").value
            )
    };
}

function clearForm() {

    document.getElementById("name").value = "";

    document.getElementById("genre").value = "";

    document.getElementById("director").value = "";

    document.getElementById("year").value = "";
}

window.onload = loadMovies;