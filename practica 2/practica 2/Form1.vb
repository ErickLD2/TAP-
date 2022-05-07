Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load


    End Sub

    Public conexion As SqlClient.SqlConnection
    Dim accion As String, nc As String, sql As String
        Dim res As Integer, nom As String, ap As String, am As String
        Dim com As SqlClient.SqlCommand, dr As SqlClient.SqlDataReader
        Dim da As SqlClient.SqlDataAdapter, cb As SqlClient.SqlCommandBuilder
        Dim ds As DataSet

        Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
            accion = ”GUARDAR”
            T1.Enabled = True
            T1.Text = ””
            T2.Enabled = True
            T2.Text = ””
            T3.Enabled = True
            T3.Text = ””
            T4.Enabled = True
            T4.Text = ””

        End Sub

        Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
            accion = ”EDITAR”
            T2.Enabled = True
            T3.Enabled = True
            T4.Enabled = True

        End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs, com As SqlClient.SqlCommand) Handles Button3.Click
        nc = T1.Text
        nom = UCase(T2.Text)
        ap = UCase(T3.Text)
        am = UCase(T4.Text)
        sql = ””
        If accion = ”GUARDAR” Then
            sql = ”exec ver_alumnos´” + nc + ”´”
            conectar()
            com = New SqlClient.SqlCommand(sql, conexion)
            dr = com.ExecuteReader
            If dr.Read Then
                MessageBox.Show(“el numero de contrlo ya existe”, “ALUMNOS”, MessageBoxButtons.OK, MessageBoxIcon.Erro)
                dr.Close()
                conexion.Close()
            Else
                sql = ”exec alta_alumnos’” + nc + ”’,’” + nom + +”’,’” + ap + +”’,’” + am + ”’”
                conectar()
                com = New SqlClient.SqlCommand(sql, conexion)
                res = com.ExecuteNonQuery
                conexion.Close()
                MessageBox.Show(“resgistro guardado”)
            End If
        ElseIf accion = “EDITAR” Then
            sql = ”exec alta_alumnos’” + nc + ”’,’” + nom + +”’,’” + ap + +”’,’” + am + ”’”
            conectar()
            com = New SqlClient.SqlCommand(sql, conexion)
            res = com.ExecuteNonQuery
            conexion.Close()
            MessageBox.Show(“resgistro modificado”)
        End If
        llenar_grif()
        T1.Enabled = False
        T2.Enabled = False
        T3.Enabled = False
        T4.Enabled = False

    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
            nc = InputBox(“ingresar el numero de contrlo”)
            sql = ”exec ver_alumno ‘” + nc + ”’”
            conectar()
            com = New SqlClient.SqlCommand(sql, conexion)
            dr = com.ExcecuteReader
            If dr.Reader Then
                T1.Text = dr(0)
                T2.Text = dr(1)
                T3.Text = dr(2)
                T4.Text = dr(3)
            Else
                MessageBox.Show(“le alumno no existe”, “ALUMNOS”)
            End If
            dr.CLose()
            conexion.CLose

        End Sub

        Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
            nc = T1.Text
            res = MessageBox.Show(“realmente quieres borrar el alumnos?”, “ALUMNOS”, MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation)
            If res = vbYes Then
                sql = ”exec  borrar_alumnos’” + nc + ”’”
                conectar()
                com = New SqlClient.SqlCommand(sql, conexion)
                res = com.ExecuteNonQuery
                conexion.Close()
                MessageBox.Show(“registro borrado”)
            End If
            llenar_grif()
            T1.Enabled = False
            T2.Enabled = False
            T3.Enabled = False
            T4.Enabled = False
            T1.Text = ””
            T2.Text = ””
            T3.Text = ””
            T4.Text = ””


        End Sub

        Private Sub Button6_Click(sender As Object, e As EventArgs) Handles Button6.Click
            End
        End Sub

        Private Sub Label2_Click(sender As Object, e As EventArgs) Handles Label2.Click

        End Sub

        Dim com As SqlClient.SqlCommand, dr As SqlClient.SqlDataReader
        Dim da As SqlClient.SqlDataAdapter, cb As SqlClient.SqlCommandBuilder
        Public Sub conectar()
            conexion = New SqlClient.SqlConnection
            conexion.ConnectionString = ("server=DESKTOP-5QFRJJT\SQLEXPRESS=Escuela;Integrated Security=True")
            conexion.Open()
        End Sub
        Private Sub llenar_grif()
            sql = ”Select*from alumnos”
            conectar()
            da = New SqlClient.SqlDataAdapter(sql, conexion)
            cb = New SqlClient.SqlCommandBUilder(da)
            ds = New DataSet
            da.Fill(ds, ”ALMUNOS”)
            dgv.DataSource = ds
            dgv.DataMember = ”ALUMNOS”
            conexion.Close()
        End Sub

    End Class

