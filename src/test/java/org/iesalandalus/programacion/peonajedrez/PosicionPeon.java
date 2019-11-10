package org.iesalandalus.programacion.peonajedrez;

import java.util.Objects;

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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(columna, fila);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof Posicion)) {
				return false;
			}
			Posicion other = (Posicion) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
				return false;
			}
			return columna == other.columna && fila == other.fila;
		}
		private PosicionPeon getEnclosingInstance() {
			return PosicionPeon.this;
		}
	}
}
