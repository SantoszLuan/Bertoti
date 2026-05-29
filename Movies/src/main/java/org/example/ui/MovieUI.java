package org.example.ui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.example.Movie;

public class MovieUI extends Application {

    // Cria conexão com o service que conversa com a API
    private final MovieService service =
            new MovieService();

    //Cria tabela
    private final TableView<Movie> table =
            new TableView<>();

    @Override
    public void start(Stage stage) {

        //Titulo
        Label title =
                new Label("Sistema de Filmes");

        //Ligam as colunas ao ID

        TableColumn<Movie, Long> idCol =
                new TableColumn<>("ID");

        idCol.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );

        TableColumn<Movie, String> nameCol =
                new TableColumn<>("Nome");

        nameCol.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );

        TableColumn<Movie, String> genreCol =
                new TableColumn<>("Gênero");

        genreCol.setCellValueFactory(
                new PropertyValueFactory<>("genre")
        );

        TableColumn<Movie, String> directorCol =
                new TableColumn<>("Diretor");

        directorCol.setCellValueFactory(
                new PropertyValueFactory<>("director")
        );

        TableColumn<Movie, Integer> yearCol =
                new TableColumn<>("Ano");

        yearCol.setCellValueFactory(
                new PropertyValueFactory<>("releaseYear")
        );

        // Adiciona todas as colunas na tabela
        table.getColumns().addAll(
                idCol,
                nameCol,
                genreCol,
                directorCol,
                yearCol
        );

        // Botão carregar filmes
        Button loadBtn =
                new Button("Carregar");

        loadBtn.setOnAction(e -> loadMovies());

        Button addBtn =
                new Button("Adicionar");

        addBtn.setOnAction(e -> addMovie());

        Button editBtn =
                new Button("Editar");

        editBtn.setOnAction(e -> editMovie());

        Button deleteBtn =
                new Button("Deletar");

        deleteBtn.setOnAction(e -> deleteMovie());

        // Organiza todos os componentes na tela
        VBox layout =
                new VBox(
                        10,
                        title,
                        loadBtn,
                        addBtn,
                        editBtn,
                        deleteBtn,
                        table
                );

        // Cria a cena da aplicação
        Scene scene =
                new Scene(layout, 700, 500);

        stage.setTitle("Movies CRUD");

        stage.setScene(scene);

        stage.show();
    }

    // Carrega todos os filmes da API para dentro da tabela
    private void loadMovies() {

        table.setItems(
                FXCollections.observableArrayList(
                        service.getMovies()
                )
        );
    }

    //Metodos CRUD

    private void addMovie() {

        Movie movie =
                showMovieDialog(null);

        if (movie != null) {

            service.addMovie(movie);

            loadMovies();
        }
    }

    private void editMovie() {

        Movie selected =
                table.getSelectionModel()
                        .getSelectedItem();

        if (selected != null) {

            Movie updated =
                    showMovieDialog(selected);

            if (updated != null) {

                service.updateMovie(
                        selected.getId(),
                        updated
                );

                loadMovies();
            }
        }
    }

    private void deleteMovie() {

        Movie selected =
                table.getSelectionModel()
                        .getSelectedItem();

        if (selected != null) {

            service.deleteMovie(selected.getId());

            loadMovies();
        }
    }

    private Movie showMovieDialog(Movie movie) {

        Dialog<Movie> dialog =
                new Dialog<>();

        dialog.setTitle("Cadastro de Filme");

        Label nameLabel =
                new Label("Nome:");

        TextField nameField =
                new TextField();

        Label genreLabel =
                new Label("Gênero:");

        TextField genreField =
                new TextField();

        Label directorLabel =
                new Label("Diretor:");

        TextField directorField =
                new TextField();

        Label yearLabel =
                new Label("Ano:");

        TextField yearField =
                new TextField();

        if (movie != null) {

            nameField.setText(movie.getName());

            genreField.setText(movie.getGenre());

            directorField.setText(movie.getDirector());

            yearField.setText(
                    String.valueOf(
                            movie.getReleaseYear()
                    )
            );
        }

        VBox layout =
                new VBox(
                        10,
                        nameLabel,
                        nameField,

                        genreLabel,
                        genreField,

                        directorLabel,
                        directorField,

                        yearLabel,
                        yearField
                );

        dialog.getDialogPane()
                .setContent(layout);

        ButtonType saveButton =
                new ButtonType(
                        "Salvar",
                        ButtonBar.ButtonData.OK_DONE
                );

        dialog.getDialogPane()
                .getButtonTypes()
                .addAll(
                        saveButton,
                        ButtonType.CANCEL
                );

        dialog.setResultConverter(button -> {

            if (button == saveButton) {

                try {

                    Movie m = new Movie();

                    m.setName(nameField.getText());

                    m.setGenre(genreField.getText());

                    m.setDirector(
                            directorField.getText()
                    );

                    m.setReleaseYear(
                            Integer.parseInt(
                                    yearField.getText()
                            )
                    );

                    return m;

                } catch (Exception e) {

                    System.out.println(
                            "Erro ao converter dados"
                    );
                }
            }

            return null;
        });

        return dialog.showAndWait()
                .orElse(null);
    }

    public static void main(String[] args) {
        launch();
    }
}