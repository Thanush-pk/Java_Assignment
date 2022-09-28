import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { myComponenet } from './myComponent';
import { ForEachComponent } from './for-each/for-each.component';
import { IfExampleComponent } from './if-example/if-example.component';
import { FormsModule } from '@angular/forms';
import { Customdirective } from './CustomDirective';

@NgModule({
  declarations: [
    AppComponent,Customdirective,myComponenet, ForEachComponent, IfExampleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
