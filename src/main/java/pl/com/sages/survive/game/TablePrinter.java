package pl.com.sages.survive.game;

public class TablePrinter implements TablePrintable {

	@Override
	public void printTable(Table table) {
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < table.getYLenght() + 2; i++){
			System.out.print('-');
		}
		System.out.println();
		for(int i = 0; i < table.getXLenght(); i++){
			System.out.print('|');
			for(int j = 0; j < table.getYLenght(); j++){
				if(table.isAlive(i,  j)){
					System.out.print(Table.ALIVE);
				} else {
					System.out.print(Table.DEAD);
				}
			}
			System.out.print('|');
			System.out.println();
		}
		for(int i = 0; i < table.getYLenght() + 2; i++){
			System.out.print('-');
		}
	}

	
	
}
