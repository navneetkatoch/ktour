package com.btes.kangratourism.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.btes.kangratourism.Maps;
import com.btes.kangratourism.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;


public class Temples extends Fragment {
    HashMap<String, String> templename;
    TextView textView2;
    ImageView imageView2;
    Button btnmap;
    Toolbar toolbar;
    String name,description,s;
    RequestQueue requestQueue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_temples, container, false);
        toolbar = (Toolbar) rootview.findViewById(R.id.toolbar);
        textView2=(TextView) rootview.findViewById(R.id.textView2);
        imageView2=(ImageView)rootview.findViewById(R.id.imageView2) ;
        btnmap=(Button)rootview.findViewById(R.id.btnmap);
        templename = new HashMap<String, String>();
        s = getArguments().getString("S");

        Log.e("NAVNEET",s);
        requestQueue = Volley.newRequestQueue(this.getActivity());
        String JsonURL = "https://busy-additives.000webhostapp.com/hello/temple.php";
        JsonArrayRequest obreq = new JsonArrayRequest(Request.Method.GET, JsonURL,

                new Response.Listener<JSONArray>() {


                    @Override
                    public void onResponse(JSONArray response) {try {
                        for(int i = 0;i<response.length();i++) {
                            JSONObject jobj2=response.getJSONObject(i);
                            name=jobj2.getString("Name");
                            JSONObject jobj = response.getJSONObject(i);
                            description = jobj.getString("Description");
                            templename.put(name,description);
                            Log.e("NAVNEET",name);

                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                        //Log.e("hello",templename.toString());
                        String s2=templename.get(s);
                        Log.e("NAVNEET",s2);

                        //Toast.makeText(getContext(),s2,Toast.LENGTH_LONG).show();
                        switch (s)
                        {
                            case "Baglamukhi Temple":

                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.baglamukhi);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Baglamukhi Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Jwalamukhi Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.jwalaji);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Jwalamukhi Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Brijeshwari Temple":
                                // toolbar.setTitle("BRIJESHWARI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.kangra);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BRIJESHWARI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Baijnath Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.baijnathtemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BAIJNATH TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Mahakal Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.mahakaal);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Mahakal Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Chamunda Devi Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.chamunda);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","CHAMUNDA TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Aghanzar Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.aghanjarmahadevtemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Aghanzar Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Indru Nag Temple":
                                // toolbar.setTitle("JWALAMUKHI TEMPLE");
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.indrunagtemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","Indru Nag Temple");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Masroor Rock Cut Temple ":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.masroor_temple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","MASROOR TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Bhagsunath Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.bhagsutemple);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","BHAGSUNAG TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Kunal Pathri Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.kunalpathri);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","KUNAL PATHRI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;
                            case "Nagni Mata Temple":
                                textView2.setText(s2);
                                imageView2.setImageResource(R.drawable.nagani);
                                btnmap.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i=new Intent(getActivity(),Maps.class);
                                        i.putExtra("S","NAGNI TEMPLE");
                                        startActivity(i);
                                    }
                                });
                                break;

                        }


                    }

                },
                // The final parameter overrides the method onErrorResponse() and passes VolleyError
                //as a parameter
                new Response.ErrorListener() {
                    @Override
                    // Handles errors that occur due to Volley
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                    }
                }
        );
        requestQueue.add(obreq);


       /* templename.put("BAGLAMUKHI TEMPLE", "Bagalamukhi or Bagala is one amongst the 10 mahavidyas (great knowledge goddesses) in Hinduism. Bagalamukhi Devi smashes the devotee’s misconceptions and delusions (or the devotee’s enemies) together with her cudgel. She is additionally called Pitambara Maa in North Bharat.Bagalamukhi Devi is one amongst the 10 Hindu Goddesses of power. The temple of Bagalamukhi is found at the doorway of Kotla Fort close to Kangra. it’s believed that the worship of Bagalamukhi not solely diminishes the ability of the enemies, however makes them helpless too.From Kangra BaglaMukhi Temple is about 25km.eetha of Ma Baglamukhi. The pujas performed at this temple square measure very powerful for ending in legal cases.Baglamukhi is loved for power, victory, protection for cuts, scars, operations and accidents and dominance over enemies. She helps bring home the bacon success in law-suits and competitions similarly as pacify quarrels to the worshipper’s advantage. Her worship is additionally effective in keeping off evil persons, spirits and Yakshani.");
        templename.put("JWALAMUKHI TEMPLE", "Not too far from Kangra is this popular place of pilgrimage. An eternally burning flame that issues from a hollow rock in the sanctum, is considered the manifestation of the goddess Devi. During March-April and September-October every year, colorful fairs are held during the Navratra celebration. Jwalamukhi temple is 30 km. from Kangra. The best known Jwala Ji shrine is located in the lower Himalayas in Jawalamukhi town of the Kangra district of Himachal Pradesh state of India, about 55 kilometers from the larger town of Dharamsala.Jwala Ji is a Hindu Goddess. Alternative spelling and names for Jawala Ji include Jwala Devi and Jwalamukhi Ji. The physical manifestation of Jwala Ji is always a set of flames burning off natural gas and the term Jwala means flame in Sanskrit.Historically, shrines dedicated to Jwala Ji were based on fissures from which natural gas seeped by itself. The number of flames is usually either seven (for the seven divine sisters) or nine (for the nine Durgas).");
        templename.put("BRIJESHWARI TEMPLE","The temple of Brijeshwari  is located in the town of Nagarkot, Kangra district, Himachal Pradesh, India and is 11 km away from the nearest railway station of Kangra. The Kangra Fort is situated nearby.A legend says that after Goddess Sati sacrificed herself in the honor of Lord Shiva in her Fathers Yagya. Shiva took her body on his shoulder and started Tandav. In order to stop him from destroying the world Lord Vishnu divided the body of Sati into 51 parts with his Chakra. The left breast of Sati fell at this spot, thus making it a Shakti Peeth.The original temple was built by the Pandavas at the time of Mahabharatha. ");
        templename.put("BAIJNATH TEMPLE", "The Baijnath temple has been continuously under worship ever since its construction in 1204 A.D. by two local merchants named Ahuka and Manyuka. The two long inscriptions in the porch of the temple indicate that a temple of Siva existed on the spot even before the present one was constructed. The present temple is a beautiful example of the early medieval north Indian temple architecture known as Nagara style of temples. The Svayambhu form of Sivalinga is enshrined in the sanctum of the temple that has five projections on each side and is surmounted with a tall curvilinear Shikhara. The entrance to sanctum is through a vestibule that has a large square Mandapa in front with two massive balconies one each in north and south. There is a small porch in front of the mandapa hall that rests on four pillars in the front preceded by an idol of Nandi, the bull, in a small pillared shrine. For more visit ......http://baijnathtemple.com/");
        templename.put("CHAMUNDA TEMPLE","The famous temple of Ma Chamunda is in Kangra district of Himachal Pradesh, India. It is around 10 km west of Palampur, on the Baner river. Around 400 years ago the king and a Brahmin priest prayed to Devi for permission to move the temple to some easily accessible location. Devi appeared to the priest in a dream giving her consent. She directed him to dig in a certain spot and an ancient idol would be found and that idol should be installed in the temple and worshipped as Her form.The king sent out men to bring the idol. Although they were able to locate it but were not able to lift it. Again Devi appeared to the priest in a dream.");
        templename.put("MASROOR TEMPLE","The Masroor one Rock Cut Temple or Himalayan Pyramid is a complex of temples located in Masroor (or Masrur) in Kangra Valley, which is 40 kilometres from Kangra city in Kangra district of the Indian state of Himachal Pradesh.It is now known as ’Thakurwada’, meaning \"Vaishnavite temples.It is a complex of monolithic rock cut temples, in shikhara (raising tower) style of classical Indian architectural style, dated by art historians to 6–8th centuries. Such an architectural temple is unique to the northern part of India while there are many places in western and southern India where such rock-cut structures exist at number of locations. There is a lake or pond called Masroor lake in front of this edifice which shows partial reflection the temples.");
        templename.put("BHAGSUNAG TEMPLE","Bhagsunag Temple: Temple of god Shiva situated around 2 km from McLeodganj Bazaar. Constructed by 1 GR by around 1800 century and then worshipped majorly by 14 Gukha platoon villages in Dharamshala. Very next to Bhagsunag temple is a water fall, one of the major tourist attraction spot in Dharamshala.The temple of Bhagsunag - dedicated to Lord Shiva, some 2 kms fromMcleodganj, is a beautiful village full of natural scenes. Their situated is a famous ancient tample of Lord Shiva, a cold running water tank and springs. The temple’s story is an interesting one, though it predates the temple itself. It is said that Bhagsu was a king, or a local chief, and his region was plagued by drought. He set out, promising his subjects that he would bring water. His search brought him to these mountains, more specifically, to a lake – the Nag Dal - which belonged to the serpent king. Bhagsu himself had magical powers. He managed to transfer the water from the lake into a kamandalu (water receptacle), and started on his way back home. ");
        templename.put("KUNAL PATHRI TEMPLE","Kunal Pathri is a little rock temple dedicated to goddess Durga in Dkunal Pathri Mandir haramshala located in the beautiful Dhauladhar Ranges in Kangra district, this ancient temple is surrounded by dense tea gardens and is the perfect place for a long peaceful walk amidst the lush surroundings. The temple displays exquisite carvings of gods and goddesses. It is said that there is a stone in the temple that always remains wet. According to local legend, the moment it starts drying, it rains. It is believed that when goddess Sati, wife of Lord Shiva, died, her skull had fallen here on this spot. ");
        templename.put("NAGNI TEMPLE","The Nagani Mata Temple, located about 6 km from Nurpur town on Pathankot / Kullu highway, is also very famous. It is unique because water comes from below the temple where the idol of Nagni Maata is placed. People who get snake bite, come to Naagni Maata and simply drinking water and applying the Mitti, get cured completely. The amount of water which flows there is quite sufficient, and there are number of water mills installed for grinding grain. Also Nurpur is famous for its silk and silk mills .there are various showroom of silk in Nurpur {himachal silk emp.,buttico} where different qualities of silk can be seen.");
        */


        return rootview;
    }

}
