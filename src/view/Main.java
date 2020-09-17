package view;

import controller.SaposThread;

public class Main {

	public static void main(String[] args) {
		SaposThread st[] =  new SaposThread[5];
		for (int i = 0; i < st.length; i++) {
			st[i]= new SaposThread(i);;
		}
		
		for (int i = 0; i < st.length; i++) {
			st[i].start();
		}

	}

}
