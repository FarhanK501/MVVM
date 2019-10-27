package com.farhank501.demo.daos

import java.util.*

data class AppConfiguration(var sessionID: String = UUID.randomUUID().toString())