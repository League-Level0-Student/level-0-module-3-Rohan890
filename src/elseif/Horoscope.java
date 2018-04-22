package elseif;

import javax.swing.JOptionPane;
public class Horoscope {
public static void main(String[] args) {
String sign = JOptionPane.showInputDialog("What is our star sign");	
if(sign.equals("aries")) {
	System.out.println("Dont spend time on things that arent earning you money today, no matter how much you love doing them. You want to do things you love doing instead of things you have to do, but right now what you really need is money. You cant be spending time today on things that arent going to up your income or improve your finances in some way, you have to earn. Once you are more financially stable, then you can take time out to do things you love doing." );
}
else if(sign.equals("taurus")) {
	System.out.println("Energy from Venus in sextile with The Moon today means you can appreciate whats all around you.Venus in Taurus is in sextile with The Moon today, making you feel more focused on whats around you and opening up your senses to your environment. Take the time today to really appreciate where you are and what you have. The little things in life are what make everything worthwhile, so stop and listen to the birds sing and see the sun shine.");
}
else if(sign.equals("gemini")) {
	System.out.println("Staying flexible will be good for you today, so its fine to change your mind about things, just watch your mood changes.Your opinions about things are likely to change throughout the day, which can be confusing for those around you. Staying flexible is a positive thing right now and your ability to change sides and alter the way you think will give you a better chance of succeeding. The only thing you need to be careful of is your mood, which could be as changeable as your view point.");
}
else if(sign.equals("cancer")) {
	System.out.println("As The Moon leaves your house today, be sure of what you wat then be determined to make it happen.The Moon leaves Cancer in sextile with Venus today, giving you some very definite energy. You should be very clear about what you want today and you can visualise this and make sure you are certain of its worth to you. Help your fighting spirit to emerge once you are sure and go for what you want with determination. Dont settle for less than perfect.");
}
else if(sign.equals("leo")) {
	System.out.println("Help someone out today and make them smile, and youll receive this kindness back later on.You can put a smile back on someones face today and help to lift them up when they feel down. You can also offer to help someone practically if thats what they need. This is likely to be someone quite close to you and whatever kindness you give to them right now will come back to you in greater measures later. Youll inspire them to be a more positive person.");
}
else if(sign.equals("virgo")) {
	System.out.println("Dont let the negative experiences from your past hold you back today, learn from them instead.The negative experiences from your past can make good life lessons, but when you are over thinking them instead of learning from them, they can start to become a problem. Dont let these past experiences hold you back and stop you from moving forward. If you are smart you can use these negatives in your future and turn them into positives by learning from them.");
}
else if(sign.equals("libra")) {
	System.out.println("Take a chance on something different today and be creative, but dont be persuaded into something you dont want. You need to be creative in your thinking today and look beyond the surface of situations and of people. Be especially careful that you are not being tricked or coerced into something that you dont want to do. Dont be afraid to look outside of the normal lines of things and take a chance on a path youve never ventured down before. The non traditional could be good for you.");
}
else if(sign.equals("scorpio")) {
	System.out.println("Be open and honest with your partner about any money issues, and you can focus on the positives.The tricky issue of money in your relationship will threaten to bring tensions at home today. You need to be totally honest with each other to face these problems together, dont be tempted to hide any money issues away for fear of the reaction youll get. You have a lot of positives in your life right now and its a shame to focus on negatives so much.");
}
else if(sign.equals("Sagittarius")) {
	System.out.println("Be careful who you talk to about your money problems today, not everyone can be trusted. When it comes to your money problems today, its all about who you tell and how much you tell. You may feel like you need to talk this through with someone and share your load, which is good, but select who you talk to carefully, not everyone wants to hear about this, and not everyone can be trusted. Dont over share your problems of money either, keep some details back.");
}
else if(sign.equals("capricorn")) {
	System.out.println("You have fuzzy energy today so dont try to make decisions, but you also have strong diplomatic skills.Pluto and Saturn are aligned in your house today, creating some fuzzy energy for you. Dont make any decisions right now as your judgement could be skewed and you may not be able to see things clearly enough to understand the implications. However, you do have great diplomatic skills and this is going to save the day for you, as you are able to smooth things over.");
}
else if(sign.equals("Aquarius")) {
	System.out.println("Follow your feelings of wanderlust today and plan a big trip or just go somewhere small for a few hours.You can afford to go with your feelings of itchy feet and needing to travel in some way today. This could be a big trip or small and it could mean some planning or none at all. The important thing is to spread your wings and give into your wanderlust. If you dont do this at all youll become frustrated, so even a few hours away somewhere different will satisfy you.");
}
else if(sign.equals("pisces")) {
	System.out.println("While you are speaking up and being heard today, make sure others are also getting the chance to speak.You have great communication today which will be very positive, but dont forget to let others speak too! You do like to be heard and you want to give your opinions, but others also want to be heard, so leave some gaps in the conversations and go out of your way to encourage others to speak up too. This will create positive communication and keep things upbeat.");
}
else {
	System.out.println("That's not a star sign!");
}
}
}
