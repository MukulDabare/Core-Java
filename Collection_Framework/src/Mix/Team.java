package Mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Team {

	public static void main(String[] args) {

		List<String> iwpu = new ArrayList<String>();
		iwpu.add("Mannat Kashyap");
		iwpu.add("Shafali Verma ");
		List<String> impu = new ArrayList<String>();
		impu.add("Akshdeep Nath");
		impu.add("Vijay Zol");
		List<String> iwp = new ArrayList<String>();
		iwp.add("Smriti Mandhana");
		iwp.add("Renuka Singh");
		List<String> imp = new ArrayList<String>();
		imp.add("MS Dhoni");
		imp.add("Rohit Sharma");

		Set<List<String>> bcciu = new HashSet<List<String>>();
		bcciu.add(iwpu);
		bcciu.add(impu);
		Set<List<String>> bccin = new HashSet<List<String>>();
		bccin.add(iwp);
		bccin.add(imp);
		Map<String, Set<List<String>>> bcci = new HashMap<String, Set<List<String>>>();
		bcci.put("Indian team under 19: ", bcciu);
		bcci.put("Indian Senior team:", bccin);

		List<String> ewpu = new ArrayList<String>();
		ewpu.add("Lizzie Scott");
		ewpu.add("Alexa Stonehouse");
		List<String> empu = new ArrayList<String>();
		empu.add("James Rew");
		empu.add("Alex Horton");
		List<String> ewp = new ArrayList<String>();
		ewp.add("Danni Wyatt");
		ewp.add("Charlie Dean");
		List<String> emp = new ArrayList<String>();
		emp.add("Ben Stokes");
		emp.add("Tom Curran");

		Set<List<String>> ecbu = new HashSet<List<String>>();
		ecbu.add(ewpu);
		ecbu.add(empu);
		Set<List<String>> ecbn = new HashSet<List<String>>();
		ecbn.add(ewp);
		ecbn.add(emp);
		Map<String, Set<List<String>>> ecb = new HashMap<String, Set<List<String>>>();
		ecb.put("England team under 19:", ecbu);
		ecb.put("England Senior team:", ecbn);

		Map<String, Map<String, Set<List<String>>>> icc = new HashMap<String, Map<String, Set<List<String>>>>();
		icc.put("Indian Cricket Team", bcci);
		icc.put("England Cricket Team", ecb);

		Set<String> count = icc.keySet();
		Iterator<String> itr1 = count.iterator();
		while (itr1.hasNext()) {

			String countryname = itr1.next();
			System.out.println(countryname);
			System.out.println("-------------------");
			Map<String, Set<List<String>>> countryboard = icc.get(countryname);
			Set<String> board = countryboard.keySet();
			Iterator<String> itr2 = board.iterator();
			while (itr2.hasNext()) {
				String teamgroup = itr2.next();
				System.out.println("    " + teamgroup);
				System.out.println("   ----------------------");
				Set<List<String>> team = countryboard.get(teamgroup);
				Iterator<List<String>> itr3 = team.iterator();
				while (itr3.hasNext()) {

					List<String> group = itr3.next();
					Iterator<String> itr4 = group.iterator();
					while (itr4.hasNext()) {
						String playername = itr4.next();
						System.out.println("        " + playername);
					}
					System.out.println("     -----------------");
				}
			}
			System.out.println("\n-------------***--------------\n");
		}
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		System.out.println("By using Enhance For loop:");
		for (String countryname : count) {
			System.out.println(countryname);
			Map<String, Set<List<String>>> countryboard = icc.get(countryname);
			Set<String> board = countryboard.keySet();
			for (String teamgroup : board) {
				System.out.println("    " + teamgroup);
				Set<List<String>> team = countryboard.get(teamgroup);
				for (List<String> group : team) {
					for (String playername : group) {
						System.out.println("        " + playername);
					}
					System.out.println("      ---------------");
				}
			}
			System.out.println("-------------***--------------");
		}
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("\nBy using forEach loop(Lambda Expression):");
		icc.forEach((country, countryboard) -> {
			System.out.println(country);
			System.out.println("-------***------------");
			countryboard.forEach((board, team) -> {
				System.out.println("  " + board);
				System.out.println("--------**------------");
				team.forEach((playername) -> {
					playername.forEach(System.out::println);
					System.out.println("------*---------------");

				});

			});

		});

		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	}
}
