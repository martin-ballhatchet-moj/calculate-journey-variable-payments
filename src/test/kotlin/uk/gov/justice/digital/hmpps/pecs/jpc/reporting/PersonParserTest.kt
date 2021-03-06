package uk.gov.justice.digital.hmpps.pecs.jpc.reporting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonParserTest {

    @Test
    fun `Assert Person can be created from json`() {
        val personJson = """{"id":"PE1","created_at":"2020-09-07T16:25:15+01:00","updated_at":"2020-09-07T16:25:24+01:00","criminal_records_office":null,"nomis_prison_number":null,"police_national_computer":"83SHX5/YL","prison_number":"PRISON1","latest_nomis_booking_id":null,"gender":"male","age":46}
""".trimIndent()

        val parsedPerson = Person.fromJson(personJson)

       Assertions.assertEquals(personFactory(), parsedPerson)
    }

}