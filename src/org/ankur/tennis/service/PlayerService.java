package org.ankur.tennis.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ankur.tennis.model.Player;

public class PlayerService {

	static  List<Player> atp = new ArrayList<>();
	 static List<Player> wta = new ArrayList<>();
		static List<Player> boys = new ArrayList<>();
		 static List<Player> girls = new ArrayList<>();
		
	
	public List<Player> getAllPlayers(String category, int rank) {
		
		
		
		for(int i = 0; i < 20; i++) {
			
			Player p = new Player("man" + (i + 1), "atp", i + 1, i + 101);
			atp.add(p);
		}
		
		
		for(int i = 0; i < 20; i++) {
			
			Player p = new Player("woman" + (i + 1), "wta", i + 1, i + 201);
			wta.add(p);
		}
		
		
		for(int i = 0; i < 20; i++) {
			
			Player p = new Player("boy" + (i + 1), "boys", i + 1, i + 301);
			boys.add(p);
		}
		
		
		for(int i = 0; i < 20; i++) {
			
			Player p = new Player("girl" + (i + 1), "girls", i + 1, i + 401);
			girls.add(p);
		}
		
		
		if(category == null) {
			return atp;
		}
		
		if(category.equals("atp"))
		{
			if(rank == 1)
			{
				List<Player> atp1 = new ArrayList<>();
				atp1.add(atp.get(0));
				atp1.add(atp.get(1));
				atp1.add(atp.get(2));
				atp1.add(atp.get(3));
				atp1.add(atp.get(4));
				return atp1;
				
			}
			if(rank == 2)
			{
				List<Player> atp2 = new ArrayList<>();
				atp2.add(atp.get(5));
				atp2.add(atp.get(6));
				atp2.add(atp.get(7));
				atp2.add(atp.get(8));
				atp2.add(atp.get(9));
				return atp2;
			}
			if(rank == 3)
			{
				List<Player> atp3 = new ArrayList<>();
				atp3.add(atp.get(10));
				atp3.add(atp.get(11));
				atp3.add(atp.get(12));
				atp3.add(atp.get(13));
				atp3.add(atp.get(14));
				return atp3;
			}
			if(rank == 4)
			{
				List<Player> atp4 = new ArrayList<>();
				atp4.add(atp.get(15));
				atp4.add(atp.get(16));
				atp4.add(atp.get(17));
				atp4.add(atp.get(18));
				atp4.add(atp.get(19));
				return atp4;
			}
		}
		
		if(category.equals("wta"))
		{
			if(rank == 1)
			{
				List<Player> wta1 = new ArrayList<>();
				wta1.add(wta.get(0));
				wta1.add(wta.get(1));
				wta1.add(wta.get(2));
				wta1.add(wta.get(3));
				wta1.add(wta.get(4));
				return wta1;
				
			}
			if(rank == 2)
			{
				List<Player> wta2 = new ArrayList<>();
				wta2.add(wta.get(5));
				wta2.add(wta.get(6));
				wta2.add(wta.get(7));
				wta2.add(wta.get(8));
				wta2.add(wta.get(9));
				return wta2;
			}
			if(rank == 3)
			{
				List<Player> wta3 = new ArrayList<>();
				wta3.add(wta.get(10));
				wta3.add(wta.get(11));
				wta3.add(wta.get(12));
				wta3.add(wta.get(13));
				wta3.add(wta.get(14));
				return wta3;
			}
			if(rank == 4)
			{
				List<Player> wta4 = new ArrayList<>();
				wta4.add(wta.get(15));
				wta4.add(wta.get(16));
				wta4.add(wta.get(17));
				wta4.add(wta.get(18));
				wta4.add(wta.get(19));
				return wta4;
			}
		}
		
		if(category.equals("boys"))
		{
			if(rank == 1)
			{
				List<Player> boys1 = new ArrayList<>();
				boys1.add(boys.get(0));
				boys1.add(boys.get(1));
				boys1.add(boys.get(2));
				boys1.add(boys.get(3));
				boys1.add(boys.get(4));
				return boys1;
				
			}
			if(rank == 2)
			{
				List<Player> boys2 = new ArrayList<>();
				boys2.add(boys.get(5));
				boys2.add(boys.get(6));
				boys2.add(boys.get(7));
				boys2.add(boys.get(8));
				boys2.add(boys.get(9));
				return boys2;
			}
			if(rank == 3)
			{
				List<Player> boys3 = new ArrayList<>();
				boys3.add(boys.get(10));
				boys3.add(boys.get(11));
				boys3.add(boys.get(12));
				boys3.add(boys.get(13));
				boys3.add(boys.get(14));
				return boys3;
			}
			if(rank == 4)
			{
				List<Player> boys4 = new ArrayList<>();
				boys4.add(boys.get(15));
				boys4.add(boys.get(16));
				boys4.add(boys.get(17));
				boys4.add(boys.get(18));
				boys4.add(boys.get(19));
				return boys4;
			}
		}
		
		if(category.equals("girls"))
		{
			if(rank == 1)
			{
				List<Player> girls1 = new ArrayList<>();
				girls1.add(girls.get(0));
				girls1.add(girls.get(1));
				girls1.add(girls.get(2));
				girls1.add(girls.get(3));
				girls1.add(girls.get(4));
				return girls1;
				
			}
			if(rank == 2)
			{
				List<Player> girls2 = new ArrayList<>();
				girls2.add(girls.get(5));
				girls2.add(girls.get(6));
				girls2.add(girls.get(7));
				girls2.add(girls.get(8));
				girls2.add(girls.get(9));
				return girls2;
			}
			if(rank == 3)
			{
				List<Player> girls3 = new ArrayList<>();
				girls3.add(girls.get(10));
				girls3.add(girls.get(11));
				girls3.add(girls.get(12));
				girls3.add(girls.get(13));
				girls3.add(girls.get(14));
				return girls3;
			}
			if(rank == 4)
			{
				List<Player> girls4 = new ArrayList<>();
				girls4.add(girls.get(15));
				girls4.add(girls.get(16));
				girls4.add(girls.get(17));
				girls4.add(girls.get(18));
				girls4.add(girls.get(19));
				return girls4;
			}
		}
		
		return null;
		
	}
	
	public Player getPlayer(String name) {
		
		if(name.startsWith("man")) {
			for(Player p: atp){
				if(p.getName().equals(name)){
					return p;
				}
			}
		}
		
		if(name.startsWith("woman")) {
			for(Player p: wta){
				if(p.getName().equals(name)){
					return p;
				}
			}
		}
		
		if(name.startsWith("boy")) {
			for(Player p: boys){
				if(p.getName().equals(name)){
					return p;
				}
			}
		}
		
		if(name.startsWith("girl")) {
			for(Player p: girls){
				if(p.getName().equals(name)){
					return p;
				}
			}
		}
		
		return null;
	}
	
	
	
	
	
}
