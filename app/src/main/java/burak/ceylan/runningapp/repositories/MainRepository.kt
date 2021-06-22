package burak.ceylan.runningapp.repositories

import burak.ceylan.runningapp.db.Run
import burak.ceylan.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO

){
    suspend fun insertRun(run: Run ) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run ) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()



}

//Repository verileri veri kaynağından çekmek için kullanılır.
// Şu an sadece Room'dan verileri alıyoruz
// ama API'den veri çektiğimizde API için de Repository gerekli olacak.