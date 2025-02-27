/*******************************************************************************
 * Este código está bajo la licencia CC by sa 
 * http://creativecommons.org/licenses/by-sa/2.5/es/
 * 
 * Licencia que le permite copiar, distribuir y comunicar públicamente la obra, transformar la obra o hacer un uso comercial de esta obra siempre y cuando cumpla las condiciones de:
 * Reconocimiento — Debe reconocer los créditos de la obra de la manera especificada por el autor Jose B. Cortés (pero no de una manera que sugiera que tiene su apoyo o apoyan el uso que hace de su obra).
 * 
 * Compartir bajo la misma licencia — Si altera o transforma esta obra, o genera una obra derivada, sólo puede distribuir la obra generada bajo una licencia idéntica a ésta.
 ******************************************************************************/
package lets.code.project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowInfoActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_info);
		Bundle extras = getIntent().getExtras();
		String name = extras.getString("NAME");
		
		
		((TextView) findViewById(R.id.nameLabel)).setText(extras.getString("NAME"));
		((TextView) findViewById(R.id.sexLabel)).setText(extras.getString("SEX"));
		((TextView) findViewById(R.id.countryLabel)).setText(extras.getString("COUNTRY"));
	}
	
	

}
