+ Main
{
	platformClass { ^OSXPlatform }

	applicationStart {
		ApplicationStart.run;
	}
	
	preferences {
		this.platform.preferencesAction.value(this)
	}
	preferencesAction_ { arg f;
		this.platform.preferencesAction_(f)
	}
	preferencesAction {
		^this.platform.preferencesAction
	}
}
