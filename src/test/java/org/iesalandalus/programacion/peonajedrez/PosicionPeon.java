package org.iesalandalus.programacion.peonajedrez;

public class PosicionPeon {

	public class Posicion {

		private int fila;
		private char columna;

		public int getFila() {
			return fila;
		}
		private void setFila(int fila) {
			this.fila = fila;
		}
		public char getColumna() {
			return columna;
		}
		private void setColumna(char columna) {
			this.columna = columna;
		}
		public Posicion(int fila, char columna) {
			super();

			this.fila = fila;
			this.columna = columna;
		}
	}
}
