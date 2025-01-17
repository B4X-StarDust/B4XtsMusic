B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private BANano As BANano 'ignore
	
	Private mElement As BANanoElement
	Private PlayM As BANanoElement
	Private StopM As BANanoElement
	Private TS As SDtensorflowClass
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(nBANano As BANano)
	BANano=nBANano
End Sub

Public Sub Show
	mElement = BANano.GetElement("#mainHolder").Append($"<label><B>AI MUSIC GENERATION</B></label><br><br>"$)
	PlayM = BANano.GetElement("#mainHolder").Append($"<button id="music" Type="button" class="">Generate</button><br><br>"$).Get("#music")
	StopM = BANano.GetElement("#mainHolder").Append($"<button id="stop" Type="button"> Stop </button><br><br>"$).Get("#stop")
	BANano.GetElement("#mainHolder").Append($"<label id="lab"> - </label>"$)
	
	PlayM.HandleEvents("click", Me, "music_click")
	StopM.HandleEvents("click", Me, "stop_click")
	StopM.SetStyle($"{ "visibility": "hidden"} "$)
	TS.Initialize(BANano,Me,"TS")
End Sub

Private Sub music_click
	TS.MusicGenerate(TS.modelName(0))
	BANano.GetElement("#lab").SetText($"WAIT "$)
	TS.PlayMusic
End Sub

Private Sub stop_click
	TS.StopMusic
	BANano.GetElement("#lab").SetText($"-"$)
	StopM.SetStyle($"{ "visibility": "hidden"} "$)
End Sub

Private Sub TS_StartedMusic
	StopM.SetStyle($"{ "visibility": "visible"} "$)
	BANano.GetElement("#lab").SetText($"Started"$)
End Sub
