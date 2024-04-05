package test;

import java.awt.EventQueue;

import view.MyNotePadView;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
				try {
					MyNotePadView frame = new MyNotePadView();
					frame.setVisible(true);
					frame.setLocation(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		
	}

}
