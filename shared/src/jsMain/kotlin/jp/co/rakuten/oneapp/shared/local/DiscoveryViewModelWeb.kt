package jp.co.rakuten.oneapp.shared.local

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.sqljs.initSqlDriver
import kotlinx.coroutines.await

suspend fun DiscoveryViewModel.Factory.getWebInstance() : DiscoveryViewModel {
    val sqlDriver: SqlDriver = initSqlDriver(DiscoveryDatabase.Schema).await()
    val repository = LocalRepository(sqlDriver)
    return DiscoveryViewModel(repository)
}