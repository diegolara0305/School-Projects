#include <iostream>

using namespace std;

int main()
{		
	    string name, ready;
	    cout << " |_O                                              O_|   \n";
		cout << "  |`-)---Welcome to the Fencing Trivia Game ---(-'|     \n";
	    cout << "  |_                                             / |    \n";
		cout << " /  |                                            | |   \n";
		cout << "	 Please, Enter your name:\n         ";
		cin >> name;

	//Rules and explenation of the game
		cout << "__________________________________________________________________________________________________\n";
		cout << "Rules:\n";
		cout << "-)--- For this Trivia Game I will be asking you some basic Questions about the magnificent sport\n       of fencing! \n";
		cout << "-)--- Each question will be worth 5 points, if you get three in a row the points will double until\n       you lose the streak!\n";
		cout << "-)--- The goal is to get to 40+ points! If after the questions you do not meet the minimum amount of\n        points, You lose the Game!\n\n";
		
	//Start game
		string a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		int score;
		cout << "__________________________________________________________________________________________________\n";
		cout << "				-)--- ARE YOU READY?---(-  \n                     ";
		cin >>ready;
			if (ready == "YES" || ready == "yes" || ready == "Yes")
			{
			cout << "			   	   -)--- AWESOME! ---(-\n";
			}
			else
			{
				cout << "				TOO BAD! we're starting anyways!\n";
			}

    //FIRST QUESTION
			cout << "__________________________________________________________________________________________________\n\n";
		cout << "		-)--- First Question! ---(-\n";
		cout << "	How many disciplines are there in the sport of fencing?\n	a)2	b)3\n	c)4	d)5\n\n	";
		cin >> a1;

		if(a1=="b" ||a1=="3")
		{
			score+=5;
			cout<<" Correct!\n  Fencing has 3 disciplines: Epee, Foil and Sabre!\n  You get your first 5 Points\n";
		}
		else{
		    score=0;
		  cout<<" Not quite! :(\n Fencing has 3 disciplines: Epee, Foil and Sabre! \n";  
		}
		cout<<" Score: "<<score<<endl;
		
		    cout << "__________________________________________________________________________________________________\n\n";
		    

    //SECOND QUESTION
        cout << "		-)--- Second Question! ---(-\n";
        cout<<"     How long (in minutes) is one period/encounter in an official boult?\n    a)5     b)4\n"<<"    c)10    d)3\n\n ";
        cin >> a2;
        
         if(a2=="d"||a2=="3")
         {
             score+=5;
             cout<<"  You're Correct!\n   Each encounter has a timer of 3 minutes for foil and Epee, in sabre time is not necessary\n   since it goes so fast!\n";
         }
         else if(!(a1=="b" || a1=="3") &&(a2!="d"||a2!="3"))
         {
             cout<<"    Wrong Again!...\n    Each encounter has a timer of 3 minutes for foil and Epee, in sabre time is not necessary\n   since it goes so fast!\n";
             
         }
         
         else
         {
             cout<<"    No!\n    Each encounter has a timer of 3 minutes for foil and Epee, in sabre time is not necessary\n   since it goes so fast!\n";
             
         }
         
         cout<<"    Score: "<<score<<endl;
         cout << "__________________________________________________________________________________________________\n\n";
         
         
    //THIRD QUESTIONN
        cout << "		-)--- Third Question! ---(-\n";
         cout<<"    what part of the body is considered a 'Valid Target' in Epee?\n";
         cout<<"    a) The Torso only   b)Everything from the weist up\n    c)The entire body   d)only the arms and the mask\n";
         cin>>a3;
         
         if(a3=="c"||a3=="The entire body"||a3=="the entire body")
         {
             cout<<"Correct!\n  In Epee you can touch your opponent anywhere you want!\n";
             
             //3 correct answers Streak!
             if((a1=="b" || a1=="3") &&(a2=="d"||a2=="3"))
             {
                 score*=2;
                 cout<<"    You're on a Streak!\n   Your points will be double now, Don't Lose it!\n";
             }
             else
             {
             score+=5;
             }
         }
         else if((a1=="b" || a1=="3") &&(a2=="d"||a2=="3") &&!(a3=="c"||a3=="The entire body"||a3=="the entire body"))
         {
             cout<<"    You were so close to the double points!! \n     But no, in Epee you can touch your opponent anywhere you want!\n";
         }
         else if(!(a1=="b" || a1=="3") &&(a2=="d"||a2=="3")&& (a3!="c"|| a3!="The entire body"|| a3!="the entire body"))
         {
             cout<<"    Looks like you're on a Streak!... of bad luck!\n    In Epee you can touch the entire body with your weapon!\n";
         }
         else
         {
             cout<<"    Incorrect!\n    In epee you can touch anywhere on your opponent's body with your weapon!\n";
         }
          cout<<"   Score: "<<score<<endl;
        
    cout << "__________________________________________________________________________________________________\n\n";
    
    
    //FOURTH QUESTION 
        cout << "		-)--- Fourth Question! ---(-\n";
        cout << " What is the name of the surface that fencers compete on?\n";
        cout<<"  a)Floor         b) Fencing Strip\n   c)Fencing Mat  d)stage\n";
        cin>>a4;
        
        if(a4=="b"||a4=="Fencing Strip"||a4=="Fencing strip"||a4=="fencing strip")
        {
            if((a2=="d"||a2=="3")&&(a3=="c"||a3=="The entire body"||a3=="the entire body"))
            {
                score*=2;
                cout<<"   CORRECT! Keep it up with your streak!\n";   
            }
            else
            {
                score+=5;
                cout<< "    Good job!\n";
            }
        }
        
        else if((a1=="b" || a1=="3") &&(a2=="d"||a2=="3")&&(a3=="c"||a3=="The entire body"||a3=="the entire body")&&!(a4=="b"||a4=="Fencing Strip"||a4=="Fencing strip"||a4=="fencing strip"))
        {
            cout<<"You've lost your streak! The correct answer is 'a'-Fencing Strip\n";
        }
        else
        {
            cout<<"Not right! It is called a 'Fencing Strip'\n";
        }
        
        
       cout<<"    Score:"<<score<<endl;
    cout << "__________________________________________________________________________________________________\n\n";
    
    
    //FIFTH QUESTION
        cout << "		-)--- Fifth Question! ---(-\n";
        cout << "   What area of the body is a Valid Target in Foil?\n";
        cout<<  "     a) The Torso         b)the legs\n     c)The entire body    d)Everything Above the Legs\n";
        cin>>a5;
        
        if(a5=="a"||a5=="the torso"||a5=="The Torso")
         {
             if((a4=="b"||a4=="Fencing Strip"||a4=="Fencing strip"||a4=="fencing strip")&&(a3=="c"||a3=="The entire body"||a3=="the entire body"))
             {
                 score*=2;
                 cout<<"    Correct!You're on a streak! Keep it going!\n";
             }
             else
             {
                 score+=5;
                 cout<<"    Correct!\n";
             }
         }
         
        else if((a2=="d"||a2=="3")&&(a3=="c"||a3=="The entire body"||a3=="the entire body")&&(a4=="b"||a4=="Fencing Strip"||a4=="Fencing strip"||a4=="fencing strip")&&!(a5=="a"||a5=="the torso"||a5=="The Torso"))
         {
             cout<<"    No!\n   In Foil you can only score by hitting the torso of your opponent!\n     You Lost your Streak!:(\n";
         }
        else
         {
            cout<< "    No!\n   In Foil you can only score by hitting the torso of your opponent!\n";
         }
         
         
         cout<<"    Score:"<<score<<endl;
    cout << "__________________________________________________________________________________________________\n\n";
    
    
    //SIXTH QUESTION
       cout << "		-)--- Sixth Question! ---(-\n";  
       cout << "    What is the valid target area for sabre?\n";
       cout<<  "     a) The Torso         b)the legs\n     c)The entire body    d)Everything Above the Legs\n";
       cin>>a6;
       
       if(a6=="d"||a6=="The Torso"||a6=="the torso")
       {
         if((a4=="b"||a4=="Fencing Strip"||a4=="Fencing strip"||a4=="fencing strip")&&(a5=="a"||a5=="the torso"||a5=="The Torso"))  
         {
             score*=2;
             cout<<"    You're Correct Again! X2 Points!\n";
         }
         else{
             score+=5;
             cout<<"    Correct!\n";
         }
       }
       
       else
       {
           cout << "    Incorrect!\n    In sabre you can score on the arms, torso, and mask of your opponen!\n";
       }
       
       
       cout<<"    Score:"<<score<<endl;
    cout << "__________________________________________________________________________________________________\n\n"; 
    
    
    //SEVENTH QUESTION
        cout << "		-)--- Sixth Question! ---(-\n"; 
        cout << "    At the end of a fencing boult, can there be a tie?\n";
        cout << "   a)Yes   b)No\n   c)yes, but unlikely\n";
        cin >> a7;
        
        if(a7=="b"||a7=="No"||a7=="no")
        {
            if((a6=="d"||a6=="The Torso"||a6=="the torso")&&(a5=="a"||a5=="the torso"||a5=="The Torso"))
            {
            cout<< "    Correct! You are on Fire!\n";
            
            score*=2;
            }
            
            else
            {
                cout<< "    Correct!";
                score+=5;
            }
        }
        
        else
        {
            cout<< "    Almost!\n";
        }
        
        cout << "    This is a hard Question, In fencing there is never a Draw, if the time runs out and both fencers\n     have the same score The machine choses randomly one of the fencers and gives them the priority, they have one more\n     minute to score a point If they do not score, the one with the priority wins the boult!\n";
       cout<<"    Score:"<<score<<endl;
       cout << "__________________________________________________________________________________________________\n\n";
       
       
    //EIHGTH QUESTION
        cout << "		-)--- Eihgth Question! ---(-\n";
        cout <<"        (Last Question "<<name<<" !)\n";
        cout << "   In which country did Fencing come to life?\n";
        cout <<"    a)USA   b)Italy\n    c)France   d)Russia\n";
        cin>>a8;
        
        if(a8=="b")
        {
            if((a7=="b"||a7=="No"||a7=="no")&&(a6=="d"||a6=="The Torso"||a6=="the torso"))
            {
                score*=2;
            }
            else
            {
               score+=5; 
            }
            cout <<"    You're Correct!\n   It was created when two drunk men started arguing at a bar, So they\n   decided to solve their issue by sowrd fighiting outisde the bar and whoever spilled a drop of the other's blood Wins!\n     It became a tradition in the town that if you had a problem you would solve it by sword fighting\n outside that bar until one started bleeding first!\n";
        }
        
        else{
            cout<<" Close! but no, Fencing originated in italy\n    It was created when two drunk men started arguing at a bar, So they\n   decided to solve their issue by sowrd fighiting outisde the bar and whoever spilled a drop of the other's blood Wins!\n     It became a tradition in the town that if you had a problem you would solve it by sword fighting\n outside that bar until one started bleeding first!\n";
            }
            
            
            cout << "__________________________________________________________________________________________________\n\n";
            
            
    //END PART 
    string end, weapon;
    cout<< "    This is the end of the Trivia!\n You scored: "<<score<<"!\n";
    
    (score<40)?cout<<"  Better Luck Next Time?\n    Did You learn anything about Fencing with this game?":cout<<"   Great Job!\n    Do you have a favorite Fencer? You can tell me their last name!\n";
    cin>>end;
    
    if(end=="yes"||end=="Yes")
    {
        cout<< "    I'm glad you learned something today! See ya!\n";
    }
    
    else if(end=="no"||end=="No")
    {
        cout<< "    How come you got so many questions wrong then?! See ya loser!\n";
    }
    
    else
    {
        cout<< "    What weapon do they fence?\n";
        cin>> weapon;
        
        if(weapon =="Epee"||weapon=="epee")
        {
            cout<< "    Ush, I don't know much about epee, I don't like epee\n  See ya!";
        }
        else if(weapon=="sabre"|| weapon=="Sabre")
        {
            cout<< "    My favorite Sabre fencer is sanguk Oh! incredible footwork he has!\n    See ya!";
        }
        else
        {
            cout<< "My favorite fencer is Race Imboden!(even though he retired:( )\nSee ya!";
        }
    }
        cout << " |_O                      O_|   \n";
		cout << "  |`-)---THANK YOU! ---(-'|     \n";
	    cout << "  |_                     / |    \n";
		cout << " /  |                    | |   \n";
    return 0;
}