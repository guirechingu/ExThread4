package controller;

public class SaposThread extends Thread {
	private static int posicao=1;
	private int distPercorida=0;
	private int distSaltoMax;
	private int DistCorrida=100;
	private int id;
	
	public SaposThread(int id) {
		this.id=id;
		this.distSaltoMax=(int)((Math.random()*10));
	}
	
	@Override
	public void run() {
		do {
			int tempo = 1000;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pular();
		} while (this.distPercorida<=this.DistCorrida);
		System.out.println("O Sapo "+this.id+" Terminou a corrida em "+SaposThread.posicao+" lugar");
		SaposThread.posicao++;
	}

	private void pular() {
		int pulo=0;
		pulo = (int)((Math.random()*distSaltoMax)+5);
		distPercorida+=pulo;
		System.out.println("O Sapo "+this.id+" Deu Um Pulo de "+pulo+" Metros");
	}
	

}
