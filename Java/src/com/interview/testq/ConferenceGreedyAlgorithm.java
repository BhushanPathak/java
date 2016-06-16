package com.interview.testq;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*You are planning a big programming conference and have received many proposals which have passed the initial screen process but you're having trouble fitting them into the time constraints of the day -- there are so many possibilities! So you write a program to do it for you. 

The conference has multiple tracks each of which has a morning and afternoon session. 
Each session contains multiple talks. 
Morning sessions begin at 9am and must finish by 12 noon, for lunch. 
Afternoon sessions begin at 1pm and must finish in time for the networking event. 
The networking event can start no earlier than 4:00 and no later than 5:00. 
No talk title has numbers in it. 
All talk lengths are either in minutes (not hours) or lightning (5 minutes). 
Presenters will be very punctual; there needs to be no gap between sessions. 


Note that depending on how you choose to complete this problem, your solution may give a different ordering or combination of talks into tracks. This is acceptable; you don’t need to exactly duplicate the sample output given here. 

Test input: 
Writing Fast Tests Against Enterprise Rails 60min 
Overdoing it in Python 45min 
Lua for the Masses 30min 
Ruby Errors from Mismatched Gem Versions 45min 
Common Ruby Errors 45min 
Rails for Python Developers lightning 
Communicating Over Distance 60min 
Accounting-Driven Development 45min 
Woah 30min 
Sit Down and Write 30min 
Pair Programming vs Noise 45min 
Rails Magic 60min 
Ruby on Rails: Why We Should Move On 60min 
Clojure Ate Scala (on my project) 45min 
Programming in the Boondocks of Seattle 30min 
Ruby vs. Clojure for Back-End Development 30min 
Ruby on Rails Legacy App Maintenance 60min 
A World Without HackerNews 30min 
User Interface CSS in Rails Apps 30min 

Test output: 
Track 1: 
09:00AM Writing Fast Tests Against Enterprise Rails 60min 
10:00AM Overdoing it in Python 45min 
10:45AM Lua for the Masses 30min 
11:15AM Ruby Errors from Mismatched Gem Versions 45min 
12:00PM Lunch 
01:00PM Ruby on Rails: Why We Should Move On 60min 
02:00PM Common Ruby Errors 45min 
02:45PM Pair Programming vs Noise 45min 
03:30PM Programming in the Boondocks of Seattle 30min 
04:00PM Ruby vs. Clojure for Back-End Development 30min 
04:30PM User Interface CSS in Rails Apps 30min 
05:00PM Networking Event 

Track 2: 
09:00AM Communicating Over Distance 60min 
10:00AM Rails Magic 60min 
11:00AM Woah 30min 
11:30AM Sit Down and Write 30min 
12:00PM Lunch 
01:00PM Accounting-Driven Development 45min 
01:45PM Clojure Ate Scala (on my project) 45min 
02:30PM A World Without HackerNews 30min 
03:00PM Ruby on Rails Legacy App Maintenance 60min 
04:00PM Rails for Python Developers lightning 
05:00PM Networking Event*/

public class ConferenceGreedyAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int slot1 = 180;
		int slot2 = 240;
		Map events = populateMap();
		events = sortMapOnValues(events);
		prepareTalkList(events, slot1, slot2);
	}
	
	static void prepareTalkList(Map m, int t1, int t2){
		System.out.println("Track 1:");
		Map dummy= new HashMap<>(m);
		int timeRemaining=t1;
		int time=540;
		Set<String> s = m.keySet();
		while(timeRemaining>=0){
			for (String title : s){
				if((int)m.get(title) <= timeRemaining){
					System.out.println(title +" " + m.get(title)+"min");
					timeRemaining-=(int)m.get(title);
					dummy.remove(title);
					//.out.println("time is " + timeRemaining);
				}else{
					continue;
				}
			}
		}
		
		System.out.println("adssasdas" + timeRemaining);
		String toBeDeleted="";
		if(timeRemaining>0){
			if(dummy.containsValue(timeRemaining)){
				Set<String> keys  = dummy.keySet();
				for(String title : keys){
					if((int)dummy.get(title) == timeRemaining){
						System.out.println(title + " " + dummy.get(title)+"min");
						toBeDeleted=title;
						break;
					}else
						continue;
				}
			}
			
		}
		System.out.println(toBeDeleted);
		dummy.remove(toBeDeleted);
		System.out.println("time is last " + timeRemaining);
		
		/*timeRemaining=t2;
		time=780;
		s = dummy.keySet();
		while(timeRemaining>=0){
			for (String title : s){
				if((int)m.get(title) <= timeRemaining){
					System.out.println(title + m.get(title)+"min");
					timeRemaining-=(int)m.get(title);
					dummy.remove(title);
				}
			}
		}*/
	}
	
	static Map sortMapOnValues(Map m){
		
		return m;
	}
	static Map populateMap(){
		Map events = new HashMap<>();
		events.put("Writing Fast Tests Against Enterprise Rails Writing Fast Tests Against Enterprise Rails ", 60);
		events.put("Overdoing it in PythonOverdoing it in Python", 45);
		events.put("Lua for the Masses", 30);
		events.put("Ruby Errors from Mismatched Gem Versions", 45);
		events.put("Common Ruby Errors", 45);
		events.put("Rails for Python Developers lightning Communicating Over Distance", 60);
		events.put("Accounting-Driven Development", 45);
		events.put("Woah", 30);
		events.put("Sit Down and Write", 30);
		events.put("Pair Programming vs Noise", 45);
		events.put("Rails Magic", 60);
		events.put("Ruby on Rails: Why We Should Move On", 60);
		events.put("Clojure Ate Scala (on my project)", 45);
		events.put("Programming in the Boondocks of Seattle", 30);
		events.put("Ruby vs. Clojure for Back-End Development", 30);
		events.put("Ruby on Rails Legacy App Maintenance", 60);
		events.put("A World Without HackerNews", 30);
		events.put("User Interface CSS in Rails Apps", 30);
		

		return events;
		
	}
	
	

}
