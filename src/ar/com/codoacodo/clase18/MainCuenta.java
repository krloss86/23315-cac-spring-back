package ar.com.codoacodo.clase18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MainCuenta {

	public static void main(String[] args) {
		
		var cuentas = new PriorityQueue<Cuenta>();
		
		cuentas.add(new Cuenta(1l,LocalDate.now(),1,TipoCuentaEnum.CC,"1234",1000d));
		cuentas.add(new Cuenta(2l,LocalDate.now(),2,TipoCuentaEnum.CA$,"1235",200d));
		cuentas.add(new Cuenta(3l,LocalDate.now(),1,TipoCuentaEnum.CA$,"1236",150d));
		cuentas.add(new Cuenta(4l,LocalDate.now(),1,TipoCuentaEnum.CAUDS,"1237",500d));
		
		//filtrar las cuentas que sean de tipo CA en pesos
		var ca$ = cuentas.stream()
			.filter(c -> c.getTipoCuenta().equals(TipoCuentaEnum.CA$))//op intermedia
			.map(cf -> cf.getNumero()) // de la cuenta solo el numero
			.collect(Collectors.toSet());//op terminal
		
		System.out.println(ca$);
		
		//ahora quiero la suma de los saldos
		var saldosTotal = cuentas
			.stream()
			.map(c->c.getSaldo())//una sola operacion intermedia
			.reduce((a,b) -> a+b); //op terminal la suma de todos los saldos
		
		System.out.println(saldosTotal);
	}

}
