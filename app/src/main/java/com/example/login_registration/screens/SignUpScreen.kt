
package com.example.login_registration.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login_registration.R
import com.example.login_registration.components.HeadingTextComponent
import com.example.login_registration.components.MyTextFieldComponent
import com.example.login_registration.components.NormalTextComponent

@Composable
fun SignUpScreen (){
    Surface (
        color = Color.White,
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column (
            modifier = Modifier.fillMaxSize()
        ){   NormalTextComponent(value = stringResource(id = R.string.hello) )
            HeadingTextComponent(value = stringResource(id = R.string.Create_accoount))
            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = ""
                    )
                }
            )
            MyTextFieldComponent(labelValue = stringResource(id = R.string.last_name),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = ""
                    )
                })
            MyTextFieldComponent(labelValue = stringResource(id = R.string.email),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = ""
                    )
                })
            MyTextFieldComponent(labelValue = stringResource(id = R.string.password),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = ""
                    )
                })

        }
    }
}


@Preview
@Composable
fun DefaultPreviewOfSingUpScreen(){
    SignUpScreen()
}