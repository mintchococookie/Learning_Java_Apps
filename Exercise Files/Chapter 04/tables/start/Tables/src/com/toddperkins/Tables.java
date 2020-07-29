package com.toddperkins;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.JScrollPane;


public class Tables {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tables window = new Tables();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class TableData extends AbstractTableModel {

		int[][] allData;
		private static final long serialVersionUID = 5269336138636744405L;
		
		public TableData() {
//			allData[0] = new int[] {1, 2, 3}; // First row says 1,2,3
//			allData[1] = new int[] {4, 5, 6}; 
//			allData[2] = new int[] {7, 8, 9}; 
			loadFile("data.csv");
		}

		void loadFile(String fileName) {
			Path file = FileSystems.getDefault().getPath("", fileName);
			try {
				InputStream input = Tables.class.getResourceAsStream(fileName);
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader buffer = new BufferedReader(reader);
				
				List<String> lines = buffer.lines().collect(Collectors.toList());
				for(int i = 0; i< lines.size(); i++) {
					String line = lines.get(i);
					String[] lineArray = line.split(",");
					if(allData == null) {
						allData = new int[lines.size()][lineArray.length];
					}
					for(int j=0; j<lineArray.length; j++) {
						int parsedInt = Integer.parseInt(lineArray[j]);
						allData[i][j] = parsedInt;
					}
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return allData.length;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return allData[rowIndex][columnIndex];
		}
	
	}

	/**
	 * Create the application.
	 */
	public Tables() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		TableData data = new TableData();
		table.setModel(data);
	}
}
