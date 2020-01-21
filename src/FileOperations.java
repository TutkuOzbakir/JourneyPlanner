import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {

	private String[] distanceList;
	private ArrayList<String> distances = new ArrayList<String>();
	private ArrayList<String> lines = new ArrayList<String>();
	private String[] lineList;
	private ArrayList<String> trips = new ArrayList<String>();
	private String[] tripList;
	private String[] stopList;
	private ArrayList<String> stops = new ArrayList<String>();

	public void readingDistanceTxt() {

		File file = new File("bin\\Distance.txt");

		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {

				distanceList = sc.nextLine().split(";");
				distances.add(distanceList[0]);
				distances.add(distanceList[1]);
				distances.add(distanceList[2]);

			}

			for (int j = 1; j < 4; j++) {
				// removes ﻿OriginStopId;DestinationStopId;Distance
				distances.remove(0);
			}

		}

		catch (FileNotFoundException e) {

			System.out.println("File 'Distance.txt' is not found.");
		}
	}

	public void readingLineTxt() {

		File file = new File("bin\\Line.txt");

		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {

				lineList = sc.nextLine().split(";");
				lines.add(lineList[0]);
				lines.add(lineList[1]);
				lines.add(lineList[2]);
				lines.add(lineList[3]);

			}

			for (int j = 1; j < 5; j++) {
				// removes ﻿﻿LineId;LineNo;Name;VehicleTypeId
				lines.remove(0);
			}

		}

		catch (FileNotFoundException e) {

			System.out.println("File 'Line.txt' is not found.");
		}

	}

	public void readingTripTxt() {

		File file = new File("bin\\Trip.txt");

		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {

				tripList = sc.nextLine().split(";");
				trips.add(tripList[0]);
				trips.add(tripList[1]);
				trips.add(tripList[2]);
				trips.add(tripList[3]);

			}

			for (int j = 1; j < 5; j++) {
				// removes LineId;Direction;Order;StopId
				trips.remove(0);
			}

		}

		catch (FileNotFoundException e) {

			System.out.println("File 'Trip.txt' is not found.");
		}

	}

	public void readingStopTxt() {

		File file = new File("bin\\Stop.txt");

		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {

				stopList = sc.nextLine().split(";");
				stops.add(stopList[0]);
				stops.add(stopList[1]);
				stops.add(stopList[2]);
				stops.add(stopList[3]);
				stops.add(stopList[4]);
				stops.add(stopList[5]);

			}

			for (int j = 1; j < 7; j++) {
				// removes StopId;Name;CoordinateX;CoordinateY;VehicleTypeId;NeighborStops
				stops.remove(0);
			}

		}

		catch (FileNotFoundException e) {

			System.out.println("File 'Stop.txt' is not found.");
		}

	}

	public void vertexOperations(GraphAdjList graph) {
		//With using Stop.txt
		for (int i = 0; i < stops.size(); i += 6) {
			Vertex vertex1 = new Vertex(stops.get(i + 1), Integer.parseInt(stops.get(i)));
			graph.vertex_list.add(vertex1);
		}
	}
	
	
	
	
	public void edgeOperations(GraphAdjList graph) {
		//With using Distance.txt
		
		for(int i = 0; i < distances.size(); i += 3) {
			Vertex vertex1 = new Vertex(distances.get(i),Integer.parseInt(distances.get(i+1)));
			
			//Edge edge1 = new Edge(origin, destination,  Integer.parseInt(stops.get(i+3)));
			
		}
		
	}
	

}
