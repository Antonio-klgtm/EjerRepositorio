package Repositorios;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Repositorio extends Application {

	@Override
	public void start(Stage stage) {
		try {



		GridPane grid = new GridPane();


		Button pulsa = new Button("¿Que dios eres? ");
		grid.add(pulsa,0,0);
		grid.setAlignment(Pos.CENTER);


		MenuBar barraMenu = new MenuBar();


//Un cambio para el commit he decidico un menubar que perimta salir

		//Creamos el menu
		Menu ayuda = new Menu("Ayuda");
		MenuItem cerrar = new MenuItem("Cerrar");

		ayuda.getItems().add(cerrar);

		barraMenu.getMenus().add(ayuda);

		grid.setMargin(barraMenu, new Insets(-350,0,0,0));

		grid.getChildren().add(barraMenu);



		//Ponemos un evento al pulsar sobre cerrar para que cierre la aplicacion
		cerrar.setOnAction(value -> {
			stage.close();
		});

// ************************si pulsamos el boton saldrá un segundo panel con las preguntas
		pulsa.setOnMouseClicked(value -> {

			Stage preguntas = new Stage();

			VBox vbox = new VBox();

			//aquí le añadimos una imagen

			//vbox.setStyle("-fx-background-image: url(/Repositorio/src/Repositorios/69.jpg)");
			Image image1 = new Image(getClass().getResourceAsStream("69.jpg"));
			ImageView imageView1 = new ImageView(image1);

			imageView1.setFitHeight(350.0);//(350.0, 550.0)
			imageView1.setFitWidth(550.0);;
			vbox.getChildren().add(imageView1);
			//ImageView inicial = new ImageView("/Repositorio/src/Repositorios/69.jpg");

			// ************************ponemos la 1º regunta
			Text texto1 = new Text("La fuerza o la paciencia, "
			+"¿cual es mejor herramienta ante un problema?");
			vbox.getChildren().add(texto1);


			// ************************posibles respuestas

			Button fuerza = new Button("Fuerza ");
			vbox.getChildren().add(fuerza);

			Button paciencia = new Button("Paciencia ");
			vbox.getChildren().add(paciencia);


			// ponemos una separación, para que los elementos no esten pegados
			vbox.setSpacing(10.0);

			// centramos el xvox
			vbox.setAlignment(Pos.CENTER);

			// Anadimos los nodos
			vbox.getChildren().addAll();



			// Creamos una escena, se la establecemos al stage y lo mostramos
			Scene Firstask = new Scene(vbox, 800.0,600.0);
			preguntas.setScene(Firstask);
			preguntas.show();




	//ELIMINAR----->// ************************si pulsamos el boton cambiara el panel con las preguntas
				fuerza.setOnMouseClicked(value1 -> {

				VBox vbo = new VBox();


				//aquí le añadimos una imagen


				imageView1.setFitHeight(350.0);//(350.0, 550.0)
				imageView1.setFitWidth(550.0);;
				vbo.getChildren().add(imageView1);

				// ************************ponemos la 2º regunta
				Text texto2 = new Text("¿Eres una persona distraída o mas bien eres una persona segura y dominante?");
				vbo.getChildren().add(texto2);


				// ************************posibles respuestas

				Button distraida = new Button("Distraída ");
				vbo.getChildren().add(distraida);

				Button sd = new Button("Segura y dominante ");
				vbo.getChildren().add(sd);


				// ponemos una separación, para que los elementos no esten pegados
				vbo.setSpacing(10.0);

				// centramos el xvox
				vbo.setAlignment(Pos.CENTER);

				// Anadimos los nodos
				vbo.getChildren().addAll();

				// Creamos una escena, se la establecemos al stage y lo mostramos


				Scene Secondask = new Scene(vbo, 800.0,600.0);
				preguntas.setScene(Secondask);
				preguntas.show();






	//ELIMINAR----->	// ************************Dios_distraido



					distraida.setOnMouseClicked(valueMono -> {
					VBox Mono = new VBox();


					Image imag = new Image(getClass().getResourceAsStream("SunWukong.jpg"));
					ImageView imageVie = new ImageView(imag);

					imageVie.setFitHeight(350.0);//(350.0, 550.0)
					imageVie.setFitWidth(550.0);;
					Mono.getChildren().add(imageVie);

					//Descripcion del mono
					preguntas.setTitle("Eres Sun Wukong eh");

					Label titleMono = new Label("Sun Wukong");
					Mono.getChildren().add(titleMono);

					Text MonoHistorio = new Text("Sun Wukong es un bromista y embaucador de primera ");
					Text MonoHistorio1 = new Text("categoría, que ama causar problemas y problemas, sin importar el daño ");
					Text MonoHistorio2 = new Text("que puede causar a las personas. Le encanta una buena pelea.");
					Mono.getChildren().add(MonoHistorio);
					Mono.getChildren().add(MonoHistorio1);
					Mono.getChildren().add(MonoHistorio2);
					Mono.setSpacing(10.0);

					// centramos el xvox
					Mono.setAlignment(Pos.CENTER);

					Scene Sun = new Scene(Mono, 800.0,600.0);
					preguntas.setScene(Sun);
					preguntas.show();
			});





				// ************************Dios_Dominante



					sd.setOnMouseClicked(valueUrano -> {
					VBox Urrano = new VBox();


					Image imagAno = new Image(getClass().getResourceAsStream("Urano.jpg"));
					ImageView imageVie1 = new ImageView(imagAno);

					imageVie1.setFitHeight(350.0);//(350.0, 550.0)
					imageVie1.setFitWidth(550.0);;
					Urrano.getChildren().add(imageVie1);

					//Descripcion del mono
					preguntas.setTitle("Eres Urano Dios Celeste");




					Text GriegoHistorio = new Text("Se lo notó ser sabio e inteligente. ");
					Text GriegoHistorio1 = new Text(" Urano también toma todo a la normalidad, "
							+ "aceptando la muerte en manos de su hijo, ");
					Text GriegoHistorio2 = new Text("pero sabiendo del futuro de su vengador.");
					Urrano.getChildren().add(GriegoHistorio);
					Urrano.getChildren().add(GriegoHistorio1);
					Urrano.getChildren().add(GriegoHistorio2);
					Urrano.setSpacing(10.0);

					// centramos el xvox
					Urrano.setAlignment(Pos.CENTER);

					Scene Ano = new Scene(Urrano, 800.0,600.0);
					preguntas.setScene(Ano);
					preguntas.show();

					});


});
// ************************si pulsamos el boton cambiara el panel con las preguntas
				paciencia.setOnMouseClicked(value2 -> {
				VBox vb = new VBox();


				//aquí le añadimos una imagen


				imageView1.setFitHeight(350.0);//(350.0, 550.0)
				imageView1.setFitWidth(550.0);;
				vb.getChildren().add(imageView1);


				// ************************ponemos la 2º regunta
				Text texto3 = new Text("¿Eres una persona energíca o una persona tranquila?");
				vb.getChildren().add(texto3);


				// ************************posibles respuestas

				Button energica = new Button("Energíca ");
				vb.getChildren().add(energica);

				Button tranquila = new Button("Tranquila ");
				vb.getChildren().add(tranquila);


				// ponemos una separación, para que los elementos no esten pegados
				vb.setSpacing(10.0);

				// centramos el xvox
				vb.setAlignment(Pos.CENTER);

				// Anadimos los nodos
				vb.getChildren().addAll();

				// Creamos una escena, se la establecemos al stage y lo mostramos


				Scene Thirdask = new Scene(vb, 800.0,600.0);
				preguntas.setScene(Thirdask);
				preguntas.show();




				// ************************Dios_Bastet



				energica.setOnMouseClicked(valueBastet -> {
				VBox Basttet = new VBox();


				Image imagBast = new Image(getClass().getResourceAsStream("Bastet.jpg"));
				ImageView imageVie2 = new ImageView(imagBast);

				imageVie2.setFitHeight(350.0);//(350.0, 550.0)
				imageVie2.setFitWidth(550.0);;
				Basttet.getChildren().add(imageVie2);

				//Descripcion del mono
				preguntas.setTitle("Eres Bastet Purr");




				Text GatoHistorio = new Text("Bastet tenía una doble personalidad.Por un lado, en su lado más bondadoso, ");
				Text GatoHistorio1 = new Text(" ocupa el puesto de guardiana del hogar y protectora de la familia. "
						+ "Además de ayudar a la fertilidad de las mujeres.  ");
				Text GatoHistorio2 = new Text("Por otro lado, posee un carácter agresivo y violento.");
				Basttet.getChildren().add(GatoHistorio);
				Basttet.getChildren().add(GatoHistorio1);
				Basttet.getChildren().add(GatoHistorio2);
				Basttet.setSpacing(10.0);

				// centramos el xvox
				Basttet.setAlignment(Pos.CENTER);

				Scene Bas = new Scene(Basttet, 800.0,600.0);
				preguntas.setScene(Bas);
				preguntas.show();

				});




				// ************************Dios_Frigg



				tranquila.setOnMouseClicked(valueBastet -> {
				VBox Friggg = new VBox();


				Image imagFrig = new Image(getClass().getResourceAsStream("Frigg.jpg"));
				ImageView imageVie3 = new ImageView(imagFrig);

				imageVie3.setFitHeight(350.0);//(350.0, 550.0)
				imageVie3.setFitWidth(550.0);;
				Friggg.getChildren().add(imageVie3);

				//Descripcion del mono
				preguntas.setTitle("Eres Frigg Reina del Valhalla");




				Text NoruegaHistorica = new Text("Frigg es descrita como una diosa bella y alta, muy aficionada a las joyas  ");
				Text NoruegaHistorica1 = new Text("y a los vestidos suntuosos. Se dice que su humor era cambiante, ");
				Text NoruegaHistorica2 = new Text("hasta el punto de que se vestía de blanco o negro según su estado de ánimo.");
				Friggg.getChildren().add(NoruegaHistorica);
				Friggg.getChildren().add(NoruegaHistorica1);
				Friggg.getChildren().add(NoruegaHistorica2);
				Friggg.setSpacing(10.0);

				// centramos el xvox
				Friggg.setAlignment(Pos.CENTER);

				Scene Fri = new Scene(Friggg, 800.0,600.0);
				preguntas.setScene(Fri);
				preguntas.show();

				});


		});




});
		Scene scene = new Scene(grid,600,400);

		stage.setScene(scene);

		stage.show();


		} catch (

				Exception e) {
					e.printStackTrace();
				}


	}



	public static void main(String[] args) {
		launch(args);
	}
}
